package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class equipment_management extends AppCompatActivity {
    Button btnEquipmentSeven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.equipment_management);
        btnEquipmentSeven = (Button)findViewById(R.id.btnEquipmentSeven);

        btnEquipmentSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerSeven = new Intent(equipment_management.this, equipment_seven.class);
                startActivity(innerSeven);
            }
        });

    }
}
