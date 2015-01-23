package ru.majestic.microracing.activities;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.Entity;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.ButtonSprite;
import org.andengine.entity.sprite.ButtonSprite.OnClickListener;
import org.andengine.ui.activity.BaseGameActivity;

import android.util.Log;

import ru.majestic.microracing.andengine.GameCamera;
import ru.majestic.microracing.andengine.GameEngineOptions;
import ru.majestic.microracing.andengine.GameScene;
import ru.majestic.microracing.resources.ResourceManager;
import ru.majestic.microracing.view.intromenu.IntroMenuCurtain;
import ru.majestic.microracing.view.mainmenu.MainMenuStartBtn;
import ru.majestic.microracing.view.mainmenu.MainMenuTitle;

public class GameFieldActivity extends BaseGameActivity implements OnClickListener {

   private Camera camera;

   // LAYERS
   private Entity backgroundLayer;
   private Entity middlegroundEntity;
   private Entity foregroundLayer;      
   
   //SRPITES
   private MainMenuTitle      mainMenuTitle;
   private MainMenuStartBtn   mainMenuStartBtn;
   
   private IntroMenuCurtain introMenuLeftCurtain;
      
   private GameState gameState;

   @Override
   public EngineOptions onCreateEngineOptions() {
      camera = new GameCamera();

      return new GameEngineOptions(camera);
   }

   @Override
   public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {      
      initLayers();
//      initViews();
      initIntroMenuViews();
      
      pOnCreateResourcesCallback.onCreateResourcesFinished();
   }
   
   private void initLayers() {
      backgroundLayer      = new Entity();
      middlegroundEntity   = new Entity();
      foregroundLayer      = new Entity();
   }      
   
   private void initViews() {
      ResourceManager.getInstance().load(this, getEngine());
      
      mainMenuTitle     = new MainMenuTitle(getEngine().getVertexBufferObjectManager());
      mainMenuStartBtn  = new MainMenuStartBtn(getEngine().getVertexBufferObjectManager());
      
      mainMenuStartBtn.setOnClickListener(this);
   }
   
   private void initIntroMenuViews() {
      ResourceManager.getInstance().load(this, getEngine());
      
      introMenuLeftCurtain = new IntroMenuCurtain(getEngine().getVertexBufferObjectManager());
      introMenuLeftCurtain.setX(0);
      introMenuLeftCurtain.setY(0);
   }

   @Override
   public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {
      final Scene scene = new GameScene();

      pOnCreateSceneCallback.onCreateSceneFinished(scene);
   }

   @Override
   public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {
      attachLayersToScene(pScene);
                  
      attachObjectsToMiddlegroundLayer ();
      attachObjectsToForegroundLayer   ();
   
      pScene.registerTouchArea(mainMenuStartBtn);
      
      pOnPopulateSceneCallback.onPopulateSceneFinished();
   }
   
   private void attachLayersToScene(Scene scene) {
      scene.attachChild(backgroundLayer);
      scene.attachChild(middlegroundEntity);
      scene.attachChild(foregroundLayer);
   }
   
   private void attachObjectsToMiddlegroundLayer() {
//      middlegroundEntity.attachChild(mainMenuTitle);
      middlegroundEntity.attachChild(introMenuLeftCurtain);
   }
   
   private void attachObjectsToForegroundLayer() {
//      foregroundLayer.attachChild(mainMenuStartBtn);
   }

   @Override
   public void onClick(ButtonSprite pButtonSprite, float pTouchAreaLocalX, float pTouchAreaLocalY) {
      if(pButtonSprite == mainMenuStartBtn) {
         Log.i("BUTTON", "Start pressed");
      }
   }

}
