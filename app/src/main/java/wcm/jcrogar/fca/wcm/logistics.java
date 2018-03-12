package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logistics extends AppCompatActivity {
    Button btnLogisticSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logistics);
        btnLogisticSgt = (Button)findViewById(R.id.btnLogisticSgt);
        btnLogisticSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSeven = new Intent(logistics.this, logistics_seven.class);
                startActivity(intentSeven);
            }
        });

    }
}
