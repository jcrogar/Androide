package wcm.jcrogar.fca.wcm;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class autono extends AppCompatActivity {
    Button btnObjetivoAM;
    Button btnPasosAM;
    Button btnConceptosAM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autono);

        btnObjetivoAM = (Button) findViewById(R.id.btnObjetivoAM);
        btnPasosAM = (Button) findViewById(R.id.btnPasosAM);
        btnConceptosAM = (Button) findViewById(R.id.btnConceptosAM);

        btnObjetivoAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objetivosAm = new Intent(autono.this, autonomous_maintenance.class);
                startActivity(objetivosAm);
            }
        });

        btnPasosAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasosAM = new Intent(autono.this, autono_seven.class);
                startActivity(pasosAM);

            }
        });

        btnConceptosAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConceptosAM = new Intent(autono.this, autono_cilr.class);
                startActivity(ConceptosAM);
            }
        });
        

    }
}
