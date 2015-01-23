package ru.majestic.microracing.activities;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.Entity;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

import ru.majestic.microracing.activities.controllers.GameStateController;
import ru.majestic.microracing.andengine.GameCamera;
import ru.majestic.microracing.andengine.GameEngineOptions;
import ru.majestic.microracing.andengine.GameScene;
import ru.majestic.microracing.resources.ResourceManager;
import ru.majestic.microracing.view.MainMenuTitle;

public class GameFieldActivity extends BaseGameActivity implements GameStateController {

   private Camera camera;

   // LAYERS
   private Entity backgroundLayer;
   private Entity middlegroundEntity;
   private Entity foregroundLayer;      
   
   //SRPITES
   private MainMenuTitle mainMenuTitle;
      
   private GameState gameState;

   @Override
   public EngineOptions onCreateEngineOptions() {
      camera = new GameCamera();

      return new GameEngineOptions(camera);
   }

   @Override
   public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {      
      initLayers();
      initViews();
      
      pOnCreateResourcesCallback.onCreateResourcesFinished();
   }
   
   private void initLayers() {
      backgroundLayer      = new Entity();
      middlegroundEntity   = new Entity();
      foregroundLayer      = new Entity();
   }      
   
   private void initViews() {
      ResourceManager.getInstance().load(this, getEngine());
      
      mainMenuTitle = new MainMenuTitle(getEngine().getVertexBufferObjectManager());
   }

   @Override
   public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {
      final Scene scene = new GameScene();

      pOnCreateSceneCallback.onCreateSceneFinished(scene);
   }

   @Override
   public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {
      attachLayersToScene(pScene);
                  
      attachObjectsToMiddlegroundLayer();
      
      pOnPopulateSceneCallback.onPopulateSceneFinished();
   }
   
   private void attachLayersToScene(Scene scene) {
      scene.attachChild(backgroundLayer);
      scene.attachChild(middlegroundEntity);
      scene.attachChild(foregroundLayer);
   }
   
   private void attachObjectsToMiddlegroundLayer() {
      middlegroundEntity.attachChild(mainMenuTitle);            
   }

   @Override
   public void changeGameState(GameState gameState) {
      this.gameState = gameState;
   }

}
