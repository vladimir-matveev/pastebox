package ru.vmatveev.pastebox.repository;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PasteBoxEntity {
  private int id;
  private String hash;
  private String data;
  private LocalDateTime lifeTime;
  private boolean isPublic;
}
