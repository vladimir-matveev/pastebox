package ru.vmatveev.pastebox;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.vmatveev.pastebox.api.response.PasteBoxResponse;
import ru.vmatveev.pastebox.exception.NotFoundEntityException;
import ru.vmatveev.pastebox.repository.PasteBoxEntity;
import ru.vmatveev.pastebox.repository.PasteBoxRepository;
import ru.vmatveev.pastebox.service.PasteBoxService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PasteBoxServiceTest {
  @Autowired
  PasteBoxService pasteBoxService;

  @MockBean
  PasteBoxRepository repository;

  @Test
  public void notExistHash(){
    when(repository.getByHash(anyString())).thenThrow(NotFoundEntityException.class);
    assertThrows(NotFoundEntityException.class, () -> pasteBoxService.getByHash("jushdoisng"));
  }

  @Test
  public void getExistHash(){
    PasteBoxEntity entity = new PasteBoxEntity();
    entity.setData("11");
    entity.setPublic(true);

    when(repository.getByHash("1")).thenReturn(entity);

    PasteBoxResponse expected = new PasteBoxResponse("11", true);
    PasteBoxResponse actual = pasteBoxService.getByHash("1");

    assertEquals(expected, actual);
  }
}
