package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.media.Image;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        btnPeopleSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPeople = new Intent(MainActivity.this, people_development.class);
                startActivity(intentPeople);
            }
        });

        btnEquipmentSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEM = new Intent(MainActivity.this, equipment_management.class);
                startActivity(intentEM);
            }
        });

        btnEnvironmentSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEnv = new Intent(MainActivity.this, environment.class);
                startActivity(intentEnv);
            }
        });

        btnLogisticSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(MainActivity.this, logistics.class);
                startActivity(intentL);
            }
        });

        btnProMSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProM = new Intent(MainActivity.this, professional_maintenance.class);
                startActivity(intentProM);
            }
        });

        btnAMSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAM = new Intent(MainActivity.this, autonomous_maintenance.class);
                startActivity(intentAM);
            }
        });

        btnCostSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCost = new Intent(MainActivity.this, cost_deployment.class);
                startActivity(intentCost);
            }
        });

        btnFocusedSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentF = new Intent(MainActivity.this, focused_improv.class);
                startActivity(intentF);
            }
        });

        btnQualitySgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, quality_control_2.class);
                startActivity(intent);
            }
        });
        btnSecuritySgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, security.class);
                startActivity(intent1);
            }
        });



    }
}