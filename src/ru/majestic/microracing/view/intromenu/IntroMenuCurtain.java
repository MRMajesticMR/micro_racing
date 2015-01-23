package ru.majestic.microracing.view.intromenu;

import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import ru.majestic.microracing.andengine.GameCamera;
import ru.majestic.microracing.resources.ResourceManager;

public class IntroMenuCurtain extends Sprite {
   
   private static final float TRANSPARENT_KOEFF = 0.7f;
   
   public IntroMenuCurtain(VertexBufferObjectManager vertexBufferObjectManager) {
      super(-1000, -1000, GameCamera.getCameraWidth() / 2, GameCamera.getCameraHeight(), ResourceManager.getInstance().getCurtainBackgroundTextureRegion(), vertexBufferObjectManager);
      
      setAlpha(TRANSPARENT_KOEFF);
   }

}
