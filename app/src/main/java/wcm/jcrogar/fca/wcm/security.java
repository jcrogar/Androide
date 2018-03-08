package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class security extends AppCompatActivity {
    Button btnActos;
    Button btnObjetivos;
    Button btnPasos;
    Button btnPoliticas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.security);
        btnActos = (Button) findViewById(R.id.btnActos);
        btnPasos = (Button) findViewById(R.id.btnPasos);
        btnObjetivos = (Button) findViewById(R.id.btnObjetivos);
        btnPoliticas = (Button) findViewById(R.id.btnPoliticas);


        btnPasos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSecurityActs = new Intent(security.this, security_seven.class);
                startActivity(intentSecurityActs);
            }
        });

        btnActos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conceptos = new Intent(security.this, security_acts.class );
                startActivity(conceptos);
            }
        });

        btnObjetivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objetivosSeguridad = new Intent(security.this, security_objetivo.class);
                startActivity(objetivosSeguridad);
            }
        });

        btnPoliticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent politicas = new Intent(security.this, security_politicas.class);
                startActivity(politicas);
            }
        });



    }
    protected void onDestroy(){
        super.onDestroy();
    }

}
