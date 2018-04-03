package ca.keithzg.fuzzywatchface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.wearable.complications.ComplicationProviderInfo;
import android.support.wearable.complications.ProviderChooserIntent;
import android.util.Log;

public class ConfigActivity extends Activity {

    static final int COMPLICATION_CONFIG_REQUEST_CODE = 1001;
    static final int UPDATE_COLORS_CONFIG_REQUEST_CODE = 1002;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fuzzy_config);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
