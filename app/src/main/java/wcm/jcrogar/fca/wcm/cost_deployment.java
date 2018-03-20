package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cost_deployment extends AppCompatActivity {

    Button btnObjetivoCosto;
    Button btn7PasosCosto;
    Button btnConceptosCosto;
    Button btnCalculoCosto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cost_deployment);
        btnObjetivoCosto = (Button)findViewById(R.id.btnObjetivoCosto);
        btn7PasosCosto = (Button)findViewById(R.id.btn7PasosCostos);
        btnConceptosCosto = (Button)findViewById(R.id.btnConceptosCosto);
        btnCalculoCosto = (Button)findViewById(R.id.btnCalculoCosto);

        btn7PasosCosto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerCostper = new Intent(cost_deployment.this, drawer_seven_cost.class);
                startActivity(innerCostper);
            }
        });

        btnConceptosCosto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerCostSeven = new Intent(cost_deployment.this, cost_perdidas.class);
                startActivity(innerCostSeven);

            }
        });

        btnCalculoCosto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculo = new Intent(cost_deployment.this, cost_calculo.class);
                startActivity(calculo);
            }
        });
        btnObjetivoCosto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent objetivo = new Intent(cost_deployment.this, cost_objetivos.class);
                startActivity(objetivo);
            }
        });

    }
}
