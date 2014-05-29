package io.leftshift.floatingview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {
    private Intent serviceIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serviceIntent = new Intent(this, ChatHeadService.class);
    }

    public void addView(View view) {
        startService(serviceIntent);
    }

    public void removeView(View view) {
        stopService(serviceIntent);
    }
}
