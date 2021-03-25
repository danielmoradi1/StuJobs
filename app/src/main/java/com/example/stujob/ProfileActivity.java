package com.example.stujob;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.View;


/**
 * @author Weronika Kinga Sleboda
 */

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // >>> Skapar top-toolbaren <<< //

        Toolbar topToolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(topToolbar);

        // Sätter up Up-knappen på top-toolbaren:
        ActionBar actionBarTop = getSupportActionBar();
        actionBarTop.setDisplayHomeAsUpEnabled(true);


        // >>> (Tillfällig lösning) Skapar bottom-toolbaren <<< //
        Toolbar bottomToolbar = (Toolbar) findViewById(R.id.bottom_toolbar);
        setSupportActionBar(bottomToolbar);

        // Sätter upp action bara för bottom-toolbaren:
        ActionBar actionBarBottom = getSupportActionBar();
        actionBarBottom.setDisplayShowTitleEnabled(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.bottom_menu_bar, menu);
        // Omvandlar menu-xml-filen till java menu-objekt
        // och sätter upp action-ikonerna upp på toolbaren

        return super.onCreateOptionsMenu(menu);
    }

    // >>> METODERNA SOM AKTIVERAR KNAPPARNA <<<//

    public void changePicture(View view) {

    }

    public void save(View view) {


    }
}
