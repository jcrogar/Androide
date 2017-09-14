package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quality_control_2 extends AppCompatActivity {
    Button btnQualityM;
    Button btnQualityN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quality_control_2);
        btnQualityM = (Button) findViewById(R.id.btnQualityM);
        btnQualityN = (Button) findViewById(R.id.btnQualityN);

        btnQualityM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quality_control_2.this, quality_control_3.class);
                startActivity(intent1);
            }
        });

        btnQualityN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(quality_control_2.this, quality_control.class);
                startActivity(intent2);
            }
        });



    }
}
