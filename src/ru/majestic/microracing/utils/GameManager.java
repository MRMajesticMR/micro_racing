package ru.majestic.microracing.utils;

public class GameManager {

   private static GameManager instance;

   private GameManager() {
   }

   public static final GameManager getInstance() {
      if (instance == null)
         instance = new GameManager();
      return instance;
   }

}
