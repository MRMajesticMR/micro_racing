package ru.majestic.microracing.andengine;

import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;

public class GameScene extends Scene {
   
   private Background background = new Background(0.09804f, 0.6274f, 0.8784f);
   
   public GameScene() {
      super();
      setBackground(background);
   }

}
