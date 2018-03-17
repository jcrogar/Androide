package wcm.jcrogar.fca.wcm;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class securitySeven extends AppCompatActivity implements View.OnClickListener, fragment1.OnFragmentInteractionListener, fragment2.OnFragmentInteractionListener{
    Button btngraf1, btnfrag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.security_sevenfrag);

        fragment1  frag1 = new fragment1();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, frag1);


        btngraf1 = (Button)findViewById(R.id.btnFrag1);
        btnfrag2 = (Button)findViewById(R.id.btnFrag2);

        btnfrag2.setOnClickListener(this);
        btngraf1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFrag1:

                fragment1 fragment1 = new fragment1();
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragment1);
                transition.commit();

                break;
            case R.id.btnFrag2:

                fragment2 fragment2 = new fragment2();
                FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fragment2);
                transition1.commit();

                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
