package com.will.custom_rxandroid.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.will.custom_rxandroid.R;
import com.will.custom_rxandroid.ui.elementary.ElementaryActivity;
import com.will.custom_rxandroid.ui.map.MapActivity;
import com.will.custom_rxandroid.ui.zip.ZipActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_elementary, R.id.bt_map, R.id.bt_zip})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_elementary:
                startActivity(new Intent(this, ElementaryActivity.class));
                break;
            case R.id.bt_map:
                startActivity(new Intent(this, MapActivity.class));
                break;
            case R.id.bt_zip:
                startActivity(new Intent(this, ZipActivity.class));
                break;
        }
    }
}
