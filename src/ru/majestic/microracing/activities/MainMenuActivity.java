package ru.majestic.microracing.activities;

import ru.majestic.microracing.R;
import ru.majestic.microracing.controllers.RouteController;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenuActivity extends Activity implements OnClickListener {
   
   private Button startGameBtn;
   private Button settingsBtn;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		initGUI();
		initGUIListeners();
	}
	
	private final void initGUI() {
	   setContentView(R.layout.activity_main_menu);
	   
	   startGameBtn = (Button) findViewById(R.id.main_menu_btn_start_game);
	   settingsBtn = (Button) findViewById(R.id.main_menu_btn_settings);
	}
	
	private final void initGUIListeners() {
	   startGameBtn.setOnClickListener(this);
	   settingsBtn.setOnClickListener(this);
	}

   @Override
   public void onClick(View v) {     
      switch(v.getId()) {
      case R.id.main_menu_btn_start_game:
         RouteController.startGameFieldActivity(this);
         break;
      case R.id.main_menu_btn_settings:
         RouteController.startSettingsActivity(this);
         break;
      }
   }

}
