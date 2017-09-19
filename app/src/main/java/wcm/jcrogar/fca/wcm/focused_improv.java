package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class focused_improv extends AppCompatActivity {

    Button btnFocusedSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.focused_improv);
        btnFocusedSgt = (Button)findViewById(R.id.btnFocusedSeven);
        btnFocusedSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerFocused = new Intent(focused_improv.this, focused_seven.class);
                startActivity(innerFocused);

            }
        });
    }
}
