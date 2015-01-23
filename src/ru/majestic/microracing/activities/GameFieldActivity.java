package ru.majestic.microracing.activities;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

import ru.majestic.microracing.andengine.GameCamera;
import ru.majestic.microracing.andengine.GameEngineOptions;
import ru.majestic.microracing.andengine.GameScene;

public class GameFieldActivity extends BaseGameActivity {        
   
   private Camera 			camera; 

   @Override
   public EngineOptions onCreateEngineOptions() {      
      camera = new GameCamera();            
      
      return new GameEngineOptions(camera);
   }

   @Override
   public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {
      
      pOnCreateResourcesCallback.onCreateResourcesFinished();
   }

   @Override
   public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {
      final Scene scene = new GameScene();
      
      pOnCreateSceneCallback.onCreateSceneFinished(scene);
   }

   @Override
   public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {
      
      pOnPopulateSceneCallback.onPopulateSceneFinished();
   }      


}
