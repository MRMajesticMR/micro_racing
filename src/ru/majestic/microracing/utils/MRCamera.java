package ru.majestic.microracing.utils;

import org.andengine.engine.camera.Camera;

public class MRCamera extends Camera{

   private static final int DEFAULT_X = 0;
   private static final int DEFAULT_Y = 0;   
   
   private static final int CAMERA_WIDTH  = 800;
   private static final int CAMERA_HEIGHT = 480;
   
   public MRCamera() {
      super(DEFAULT_X, DEFAULT_Y, CAMERA_WIDTH, CAMERA_HEIGHT);
   }

}
