package ru.majestic.microracing.resources;

import org.andengine.engine.Engine;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;

import android.content.Context;

public class ResourceManager {

   private static ResourceManager instance;
   
   //BITMAP_ATLASES
   private BitmapTextureAtlas       mainMenuTextureAtlas;
   
   //TEXTURE_REGIONS
   private TextureRegion            gameTitleTextureRegion;
   private ITiledTextureRegion      startButtonTextureRegion;
   
   private ResourceManager() {
      
   }
   
   public static ResourceManager getInstance() {
      if(instance == null)
         instance = new ResourceManager();
      
      return instance;
   }
   
   public void load(Context context, Engine engine) {   
      mainMenuTextureAtlas          = new BitmapTextureAtlas(engine.getTextureManager(), 256, 128);
      
      gameTitleTextureRegion     = BitmapTextureAtlasTextureRegionFactory.createFromAsset(      mainMenuTextureAtlas,         context.getAssets(), "gfx/views/main_menu/game_title.png",     0,    0);
      startButtonTextureRegion   = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset( mainMenuTextureAtlas,         context.getAssets(), "gfx/views/main_menu/start_btn.png",    0,    64,    2,    1);
      
      mainMenuTextureAtlas.load();
   }
   
   public TextureRegion getGameTitleTextureRegion() {
      return gameTitleTextureRegion;
   }
   
   public ITiledTextureRegion getStartButtonTextureRegion() {
      return startButtonTextureRegion;
   }
   
}
