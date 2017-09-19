package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class professional_maintenance extends AppCompatActivity {
    Button btnPMSevenSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.professional_maintenance);
        btnPMSevenSgt = (Button)findViewById(R.id.btnPMSeven);

        btnPMSevenSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerPM = new Intent(professional_maintenance.this, prfessionalm_seven.class);
                startActivity(innerPM);
            }
        });

    }
}
