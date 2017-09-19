package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class people_development extends AppCompatActivity {
    Button btnPeopleSeven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people_development);
        btnPeopleSeven = (Button)findViewById(R.id.btnPeople);

        btnPeopleSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerSeven = new Intent (people_development.this, people_development_seven.class);
                startActivity(innerSeven);

            }
        });

    }
}
