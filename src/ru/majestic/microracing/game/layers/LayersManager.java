package ru.majestic.microracing.game.layers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.andengine.entity.scene.Scene;

public class LayersManager {

   private List<IMRLayer> layers = new ArrayList<IMRLayer>();

   public LayersManager() {
      layers.add(new BackgroundLayer());
      layers.add(new GameLayer());
      layers.add(new ControlLayer());
   }

   public final void addLayersToScene(Scene scene) {
      final Iterator<IMRLayer> iter = layers.iterator();
      
      while (iter.hasNext())
         scene.attachChild(iter.next());
   }

}
