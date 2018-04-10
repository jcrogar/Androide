package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cost_calculo extends AppCompatActivity {
    Button btnQuick;
    Button btnStandar;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cost_calculo);
        btnQuick = (Button) findViewById(R.id.btnQuick);
        btnStandar = (Button) findViewById(R.id.btnStandard);

        btnStandar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Graf = new Intent(cost_calculo.this, pruebaGrafica.class);
                startActivity(Graf);
            }
        });

        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculoQuick = new Intent(cost_calculo.this, cost_calculoqk.class);
                startActivity(calculoQuick);
            }
        });

    }
}
