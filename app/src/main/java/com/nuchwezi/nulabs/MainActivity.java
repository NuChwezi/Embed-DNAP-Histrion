package com.nuchwezi.nulabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switchToDNAP_Persona("bb765c31-6959-49d0-b192-6c83bdab5cb4", "LABS");
    }

    private void switchToDNAP_Persona(String personaUUID, String autoInstallChannel) {
        Intent _intent = new Intent(MainActivity.this, com.nuchwezi.dnaphistrion.HistrionMainActivity.class);

        if(personaUUID != null){
            _intent.putExtra("PERSONA:UUID", personaUUID);
        }

        if(autoInstallChannel != null){
            _intent.putExtra("CHANNEL:NAME", autoInstallChannel);
        }

        startActivity(_intent);
    }

}
