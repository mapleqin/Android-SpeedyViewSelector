package net.soulwolf.widget.speedyselector.sample;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(R.color.sample_primary);
            tintManager.setNavigationBarTintEnabled(true);
            tintManager.setNavigationBarTintResource(R.color.sample_primary);
        }
        mToolbar = (Toolbar) findViewById(R.id.tl_custom);
        mToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mToolbar);

    }



}
