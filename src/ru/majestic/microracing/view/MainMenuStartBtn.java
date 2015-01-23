package ru.majestic.microracing.view;

import org.andengine.entity.sprite.ButtonSprite;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import ru.majestic.microracing.resources.ResourceManager;

public class MainMenuStartBtn extends ButtonSprite {

   private static final int X          = 40;
   private static final int Y          = 500;
   private static final int WIDTH      = 400;
   private static final int HEIGHT     = 100; 
   
   public MainMenuStartBtn(VertexBufferObjectManager vertexBufferObjectManager ) {
      super(-1000, -1000, ResourceManager.getInstance().getStartButtonTextureRegion(), vertexBufferObjectManager);
      
      setX       (X);
      setY       (Y);
      setWidth   (WIDTH);
      setHeight  (HEIGHT);
   }

}
