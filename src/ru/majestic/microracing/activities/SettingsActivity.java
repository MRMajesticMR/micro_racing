package ru.majestic.microracing.activities;

import ru.majestic.microracing.R;
import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity {
   
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      
      initGUI();
   }
   
   private final void initGUI() {
      setContentView(R.layout.activity_settings);
   }

}
