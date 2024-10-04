package ru.vmatveev.pastebox.repository;

import java.util.List;

public interface PasteBoxRepository {
  PasteBoxEntity getByHash(String hash);

  List<PasteBoxEntity> getListOfPublicAndAlive(int amount);

  void add(PasteBoxEntity pasteBoxEntity);
}
