package ru.vmatveev.pastebox.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vmatveev.pastebox.api.request.PasteBoxRequest;
import ru.vmatveev.pastebox.api.response.PasteBoxResponse;
import ru.vmatveev.pastebox.api.response.PasteBoxUrlResponse;
import ru.vmatveev.pastebox.service.PasteBoxService;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class PasteBoxController {

  private final PasteBoxService pasteBoxService;

  @GetMapping("/{hash}")
  public PasteBoxResponse getByHash(@PathVariable String hash) {
    return pasteBoxService.getByHash(hash);
  }

  @GetMapping("/")
  public Collection<PasteBoxResponse> getPublicPasteList() {
    return pasteBoxService.getPublicPasteBoxes();
  }

  @PostMapping("/")
  public PasteBoxUrlResponse add(@RequestBody PasteBoxRequest request) {
    return pasteBoxService.create(request);
  }

}
