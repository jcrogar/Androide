package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cost_deployment extends AppCompatActivity {

    Button btnCostSevenSgt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cost_deployment);
    btnCostSevenSgt = (Button)findViewById(R.id.btnCostSeven);

        btnCostSevenSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerCostSeven = new Intent(cost_deployment.this, cost_seven.class);
                startActivity(innerCostSeven);

            }
        });

    }
}