package ru.majestic.microracing.view.mainmenu;

import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import ru.majestic.microracing.resources.ResourceManager;

public class MainMenuTitle extends Sprite {

   private static final int X          = 40;
   private static final int Y          = 100;
   private static final int WIDTH      = 400;
   private static final int HEIGHT     = 100;   
   
   public MainMenuTitle(VertexBufferObjectManager vertexBufferObjectManager) {
      super(-1000, -1000, ResourceManager.getInstance().getGameTitleTextureRegion(), vertexBufferObjectManager);
      
      setX       (X);
      setY       (Y);
      setWidth   (WIDTH);
      setHeight  (HEIGHT);      
   }

}
