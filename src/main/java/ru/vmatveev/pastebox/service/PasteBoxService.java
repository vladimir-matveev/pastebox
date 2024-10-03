package ru.vmatveev.pastebox.service;

import ru.vmatveev.pastebox.api.request.PasteBoxRequest;
import ru.vmatveev.pastebox.api.response.PasteBoxResponse;
import ru.vmatveev.pastebox.api.response.PasteBoxUrlResponse;

import java.util.List;

public interface PasteBoxService {
  PasteBoxResponse getByHash(String hash);
  List<PasteBoxResponse> getPublicPasteBoxes(int amount);
  PasteBoxUrlResponse create(PasteBoxRequest request);
}
