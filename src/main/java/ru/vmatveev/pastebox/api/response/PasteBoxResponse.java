package ru.vmatveev.pastebox.api.response;

import lombok.Data;
import ru.vmatveev.pastebox.api.request.PublicStatus;

@Data
public class PasteBoxResponse {
  private String data;
  private PublicStatus status;
}
