package com.develoware.vape;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShopDeviceActivity extends Activity {

    String title = "폐호흡 기기";

    // Define
    TextView shop_main_menu_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_main);

        // Declare
        shop_main_menu_title = findViewById(R.id.shop_main_menu_title);


        shop_main_menu_title.setText(title);
    }
}
