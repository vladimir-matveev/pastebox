package ru.vmatveev.pastebox.service;

import ru.vmatveev.pastebox.api.request.PasteBoxRequest;
import ru.vmatveev.pastebox.api.response.PasteBoxResponse;
import ru.vmatveev.pastebox.api.response.PasteBoxUrlResponse;

import java.util.List;

public class PasteBoxServiceImpl implements PasteBoxService{
  @Override
  public PasteBoxResponse getByHash(String hash) {
    return null;
  }

  @Override
  public List<PasteBoxResponse> getPublicPasteBoxes(int amount) {
    return List.of();
  }

  @Override
  public PasteBoxUrlResponse create(PasteBoxRequest request) {
    return null;
  }
}
