package com.example.webprog26.flavorsadv2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import com.example.Purchaser;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        initToolbar(mToolbar);

        Button purchaseButton = (Button) findViewById(R.id.btnPurchase);
        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Purchaser purchaser = new Purchaser(getBaseContext());
                purchaser.onPurchase();
            }
        });
    }

    /**
     * Initializes toolbar
     * @param toolbar
     */
    private void initToolbar(Toolbar toolbar)
    {
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
    }
}
