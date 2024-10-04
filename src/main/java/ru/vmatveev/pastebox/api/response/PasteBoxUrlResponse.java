package ru.vmatveev.pastebox.api.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PasteBoxUrlResponse {
  private final String url;
}
