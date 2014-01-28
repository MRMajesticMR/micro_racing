package ru.majestic.microracing.controllers;

import ru.majestic.microracing.activities.GameFieldActivity;
import ru.majestic.microracing.activities.SettingsActivity;
import android.content.Context;
import android.content.Intent;

public class RouteController {

   public static final void startGameFieldActivity(Context context) {
      context.startActivity(new Intent(context, GameFieldActivity.class));
   }

   public static final void startSettingsActivity(Context context) {
      context.startActivity(new Intent(context, SettingsActivity.class));
   }

}
