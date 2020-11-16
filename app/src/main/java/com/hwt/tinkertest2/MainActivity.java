package com.hwt.tinkertest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loadPath = findViewById(R.id.btn_load);
        loadPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Tinker.isTinkerInstalled()) {
                    TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(),
                            getExternalCacheDir().getAbsolutePath()+ "/patch_signed_7zip.apk");
                    Log.i("HWT", "onClick: "+getExternalCacheDir().getAbsolutePath());
                }
            }
        });
        Toast.makeText(this,TestDelClass.getMyClassName(),Toast.LENGTH_SHORT).show();
    }
}