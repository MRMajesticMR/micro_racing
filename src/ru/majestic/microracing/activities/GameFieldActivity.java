package ru.majestic.microracing.activities;

import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import ru.majestic.microracing.utils.MRCamera;
import ru.majestic.microracing.utils.MREngineOptions;

public class GameFieldActivity extends SimpleBaseGameActivity {        
   
   private MRCamera camera;      

   @Override
   public EngineOptions onCreateEngineOptions() {      
      camera = new MRCamera();            
      
      return new MREngineOptions(camera);
   }

   @Override
   protected void onCreateResources() {
      
   }

   @Override
   protected Scene onCreateScene() {
      Scene scene = new Scene();
      scene.setBackground(new Background(0.09804f, 0.6274f, 0.8784f));      
      return scene;
   }      


}
