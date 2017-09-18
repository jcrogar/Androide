package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class security extends AppCompatActivity {
    Button btnSecuritySeven;
    Button btnSecurityActs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.security);
        btnSecuritySeven = (Button) findViewById(R.id.btnSecuritySeven);
        btnSecurityActs = (Button) findViewById(R.id.btnSecurityActs);

        btnSecurityActs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSecurityActs = new Intent(security.this, security_acts.class);
                startActivity(intentSecurityActs);
            }
        });

        btnSecuritySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSecurityS = new Intent(security.this, security_seven.class);
                startActivity(intentSecurityS);
            }
        });



    }

}
