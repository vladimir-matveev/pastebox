package ru.vmatveev.pastebox.api.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.vmatveev.pastebox.api.request.PublicStatus;

@Data
@RequiredArgsConstructor
public class PasteBoxResponse {
  private final String data;
  private final boolean isPublic;
}
