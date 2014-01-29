package ru.majestic.microracing.activities;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

import ru.majestic.microracing.game.layers.LayersManager;
import ru.majestic.microracing.utils.MRCamera;
import ru.majestic.microracing.utils.MREngineOptions;
import ru.majestic.microracing.utils.MRScene;

public class GameFieldActivity extends BaseGameActivity {        
   
   private Camera camera; 
   private LayersManager layersManager;

   @Override
   public EngineOptions onCreateEngineOptions() {      
      camera = new MRCamera();            
      
      return new MREngineOptions(camera);
   }

   @Override
   public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {
      layersManager = new LayersManager();
      pOnCreateResourcesCallback.onCreateResourcesFinished();
   }

   @Override
   public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {
      final Scene scene = new MRScene();
      
      pOnCreateSceneCallback.onCreateSceneFinished(scene);
   }

   @Override
   public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {
      layersManager.addLayersToScene(pScene);
      pOnPopulateSceneCallback.onPopulateSceneFinished();
   }      


}
