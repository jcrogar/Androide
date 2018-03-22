package wcm.jcrogar.fca.wcm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragment1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment1 extends Fragment {
    EditText textGente, textMinutos, textDia, textSemana, textMes;
    TextView textTotal;
    Button btnCalculatAct;
    DecimalFormat precision = new DecimalFormat("#.##");

    

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        textGente = (EditText) v.findViewById(R.id.textGente);
        textMinutos = (EditText) v.findViewById(R.id.textMinutos);
        textDia = (EditText) v.findViewById(R.id.textDia);
        textSemana = (EditText) v.findViewById(R.id.textSemana);
        textMes = (EditText) v.findViewById(R.id.textMes);
        textTotal = (TextView) v.findViewById(R.id.textTotal);
        btnCalculatAct = (Button)v.findViewById(R.id.btnCalcularAct);

        btnCalculatAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }
        });

        return v;
    }



    public void calcular() {


            String valorGente = textGente.getText().toString();
            String valorMinutos = textMinutos.getText().toString();
            String valorDia = textDia.getText().toString();
            String valorSemana = textSemana.getText().toString();
            String valorMes = textMes.getText().toString();

            Double numGente = Double.parseDouble(valorGente);
            Double numMinuto = Double.parseDouble(valorMinutos);
            Double numDia = Double.parseDouble(valorDia);
            Double numSemana =  Double.parseDouble(valorSemana);
            Double numMes = Double.parseDouble(valorMes);

            Double calculoDia = 0.0;
            Double calculoSemana = 0.0;
            Double calculoMes = 0.0;

            String valorAct = "", valorActS = "", valorActM = "";

            if(valorDia.equals("")){
            calculoDia = 0.0;
            //valorAct = String.format("%.2f",calculoDia);
                //textTotal.setText(valorAct);
            }
            else if(valorSemana.equals("")){
            calculoSemana = 0.0;
             //valorActS  = String.format("%.2f", calculoSemana);
            //textTotal.setText(valorActS);
            }
            else if(valorMes.equals("")){
                calculoMes = 0.0;
                //valorActM = String.format("%.2f", calculoMes);
              //  textTotal.setText(valorActM);
            }
            else if (valorDia.length()>0){
                calculoDia = numGente * numMinuto * (6.94 / 60) * numDia * 322;
              //  valorAct = String.format("%.2f", calculoDia);
                //textTotal.setText(valorAct);
            }
            else if (valorSemana.length()>0) {
                calculoSemana = numGente * numMinuto * (6.94 / 60) * numSemana * 46;
               // valorActS = String.format("%.2f", calculoSemana);
                //textTotal.setText(valorActS);
            }
            else if (valorMes.length()>0){
                calculoMes = numGente*numMinuto*(6.94/60)*numMes*12;
             //   valorActM  = String.format("%.2f", calculoMes);
               // textTotal.setText(valorM);
            }

           Double auxTotal = calculoMes+calculoSemana+calculoDia;
           String DSM = String.format("%.2f",auxTotal);

            textTotal.setText(DSM);



    }

}
