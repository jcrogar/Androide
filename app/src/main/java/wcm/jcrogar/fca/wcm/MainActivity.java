package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.security.InvalidAlgorithmParameterException;
import java.security.Security;

public class MainActivity extends AppCompatActivity {
    ImageButton btnSecuritySgt;
    ImageButton btnCostSgt;
    ImageButton btnFocusedSgt;
    ImageButton btnAMSgt;
    ImageButton btnProMSgt;
    ImageButton btnQualitySgt;
    ImageButton btnLogisticSgt;
    ImageButton btnEnvironmentSgt;
    ImageButton btnEquipmentSgt;
    ImageButton btnPeopleSgt;
    ImageButton btnwcmSgt;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnwcmSgt = (ImageButton)findViewById(R.id.btnWcm);
        btnSecuritySgt = (ImageButton) findViewById(R.id.btnSecurity);
        btnQualitySgt = (ImageButton) findViewById(R.id.btnQuality);
        btnFocusedSgt = (ImageButton) findViewById(R.id.btnFocused);
        btnCostSgt = (ImageButton) findViewById(R.id.btnCost);
        btnAMSgt = (ImageButton) findViewById(R.id.btnAM);
        btnProMSgt = (ImageButton) findViewById(R.id.btnProM);
        btnLogisticSgt = (ImageButton) findViewById(R.id.btnLogistic);
        btnEnvironmentSgt = (ImageButton) findViewById(R.id.btnEnviroment);
        btnEquipmentSgt = (ImageButton) findViewById(R.id.btnEquipment);
        btnPeopleSgt = (ImageButton) findViewById(R.id.btnPeople);
        mp = MediaPlayer.create(this, R.raw.click);

        btnwcmSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenWcm = new Intent(MainActivity.this, info_wcm.class);
                startActivity(intenWcm);
                mp.start();

            }
        });

        btnPeopleSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPeople = new Intent(MainActivity.this, people_development.class);
                startActivity(intentPeople);
                mp.start();
            }
        });

        btnEquipmentSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEM = new Intent(MainActivity.this, equipment_management.class);
                startActivity(intentEM);
                mp.start();
            }
        });

        btnEnvironmentSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEnv = new Intent(MainActivity.this, environment.class);
                startActivity(intentEnv);
                mp.start();
            }
        });

        btnLogisticSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(MainActivity.this, logistics.class);
                startActivity(intentL);
                mp.start();
            }
        });

        btnProMSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProM = new Intent(MainActivity.this, professional_maintenance.class);
                startActivity(intentProM);
                mp.start();
            }
        });

        btnAMSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAM = new Intent(MainActivity.this, autono.class);
                startActivity(intentAM);
                mp.start();
            }
        });

        btnCostSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCost = new Intent(MainActivity.this, cost_deployment.class);
                startActivity(intentCost);
                mp.start();
            }
        });

        btnFocusedSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentF = new Intent(MainActivity.this, focused_improv.class);
                startActivity(intentF);
                mp.start();
            }
        });

        btnQualitySgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, quality_control_2.class);
                startActivity(intent);
                mp.start();
            }
        });
        btnSecuritySgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, security.class);
                startActivity(intent1);
                mp.start();
            }
        });



    }
}
