package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.security.Security;

public class MainActivity extends AppCompatActivity {
    Button btnQualitySgt;
    ImageButton btnCostDeploymentSgt;
    ImageButton btnAmbientalSgt;
    ImageButton btnFocusedImprovmentSgt;
    ImageButton btnSecuritySgt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSecuritySgt = (ImageButton) findViewById(R.id.btnSecurity);
        btnQualitySgt = (Button)findViewById(R.id.btnQuality);


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
