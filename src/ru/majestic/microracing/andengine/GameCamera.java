package ru.majestic.microracing.andengine;

import org.andengine.engine.camera.Camera;

public class GameCamera extends Camera{

   private static final int DEFAULT_X = 0;
   private static final int DEFAULT_Y = 0;   
   
   private static final int CAMERA_WIDTH  = 480;
   private static final int CAMERA_HEIGHT = 800;
   
   public GameCamera() {
      super(DEFAULT_X, DEFAULT_Y, CAMERA_WIDTH, CAMERA_HEIGHT);
   }
   
   public static int getCameraWidth() {
      return CAMERA_WIDTH;
   }
   
   public static int getCameraHeight() {
      return CAMERA_HEIGHT;
   }

}
