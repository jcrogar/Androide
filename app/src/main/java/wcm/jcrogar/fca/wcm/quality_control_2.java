package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quality_control_2 extends AppCompatActivity {
    Button btnObjetivoQC;
    Button btnSevenQC;
    Button btnToolsQC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quality_control_2);
        btnObjetivoQC = (Button) findViewById(R.id.btnObjetivoQC);
        btnSevenQC = (Button) findViewById(R.id.btnSevenQC);
        btnToolsQC = (Button) findViewById(R.id.btnToolsQC);
        btnSevenQC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerSeven = new Intent(quality_control_2.this, quality_control_seven.class);
                startActivity(innerSeven);
            }
        });

        btnToolsQC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quality_control_2.this, quality_control_3.class);
                startActivity(intent1);
            }
        });

        btnObjetivoQC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(quality_control_2.this, quality_control.class);
                startActivity(intent2);
            }
        });



    }
}
