package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class environment extends AppCompatActivity {
    Button btnEnviSevenSgt;
    Button btnEnvRsSgt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.environment);

        btnEnviSevenSgt = (Button)findViewById(R.id.btnEnviSevenSgt);
        btnEnvRsSgt = (Button)findViewById(R.id.btnEnvRsSgt);
        btnEnviSevenSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerSeven = new Intent(environment.this, environment_seven.class);
                startActivity(innerSeven);
            }
        });
        btnEnvRsSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innserRs = new Intent(environment.this, environment_rs.class);
                startActivity(innserRs);
            }
        });


    }
}
