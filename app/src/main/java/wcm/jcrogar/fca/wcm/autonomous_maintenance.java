package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class autonomous_maintenance extends AppCompatActivity {
    Button btnAutoSgt;
    Button btnCILRSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autonomous_maintenance);
        btnAutoSgt = (Button)findViewById(R.id.btnAutonomousSeven);
        btnCILRSgt = (Button)findViewById(R.id.btnAutoCILR);

        btnAutoSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerSevenAM = new Intent(autonomous_maintenance.this, autono_seven.class);
                startActivity(innerSevenAM);
            }
        });
        btnCILRSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerCILR = new Intent(autonomous_maintenance.this, autono_cilr.class);
                startActivity(innerCILR);
            }
        });

    }
}
