package ru.majestic.microracing.resources;

import org.andengine.engine.Engine;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.TextureRegion;

import android.content.Context;

public class ResourceManager {

   private static ResourceManager instance;
   
   //BITMAP_ATLASES
   private BitmapTextureAtlas gameTitleBitmapTextureAtlas;
   
   //TEXTURE_REGIONS
   private TextureRegion   gameTitleTextureRegion;
   
   private ResourceManager() {
      
   }
   
   public static ResourceManager getInstance() {
      if(instance == null)
         instance = new ResourceManager();
      
      return instance;
   }
   
   public void load(Context context, Engine engine) {   
      gameTitleBitmapTextureAtlas = new BitmapTextureAtlas(engine.getTextureManager(), 32, 32);
      gameTitleTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(gameTitleBitmapTextureAtlas, context.getAssets(), "gfx/face_box.png", 0, 0);
      gameTitleBitmapTextureAtlas.load();
   }
   
   public TextureRegion getGameTitleTextureRegion() {
      return gameTitleTextureRegion;
   }
   
}
