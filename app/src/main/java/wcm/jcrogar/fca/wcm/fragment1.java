package wcm.jcrogar.fca.wcm;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast toast1 = Toast.makeText(getActivity(),"Recuerda llenar solo una opcion, En cada cuanto se realiza esta actividad", Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.CENTER, 0, 0);
        toast1.show();

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
                validar();
            }
        });
        return v;
    }



    public void validar()
    {

        if (textDia.getText().toString().length() == 0  && textSemana.getText().toString().length()==0 && textMes.getText().toString().length() == 0)
        {
            Toast toast1 = Toast.makeText(getActivity(),"Ingrese Datos en Dia, Semana o Mes", Toast.LENGTH_LONG);
            toast1.setGravity(Gravity.CENTER, 0, 0);
            toast1.show();
            textTotal.setText("0.00");
        }

        else if (textDia.getText().toString().length() == 0 && textSemana.getText().toString().length() == 0)
            {
                calcularMes();
            }
        else if (textSemana.getText().toString().length() == 0 && textMes.getText().toString().length() == 0)
            {
                calcularDia();
            }
        else if (textDia.getText().toString().length() == 0 && textMes.getText().toString().length() == 0)
            {
                calcularSemana();
            }
    }

   public void calcularSemana()
   {
        String valorGente = textGente.getText().toString();
        String valorMinutos = textMinutos.getText().toString();
        String valorSemana = textSemana.getText().toString();
        Double numGente = Double.parseDouble(valorGente);
        Double numMinuto = Double.parseDouble(valorMinutos);
        Double numSemana = Double.parseDouble(valorSemana);
        Double calculoSemana;
        calculoSemana = numGente * numMinuto * (6.94 / 60) * numSemana * 46;
        String semana = String.format("%.2f",calculoSemana);
        textTotal.setText(semana);
    }

    public void calcularMes()
    {
        String valorGente = textGente.getText().toString();
        String valorMinutos = textMinutos.getText().toString();
        String valorMes = textMes.getText().toString();
        Double numGente = Double.parseDouble(valorGente);
        Double numMinuto = Double.parseDouble(valorMinutos);
        Double numMes = Double.parseDouble(valorMes);
        Double calculoMes;
        calculoMes = numGente * numMinuto * (6.94 / 60) * numMes * 12;
        String Mes = String.format("%.2f",calculoMes);
        textTotal.setText(Mes);

    }

  public void calcularDia()
  {
      String valorGente = textGente.getText().toString();
      String valorMinutos = textMinutos.getText().toString();
      String valorDia = textDia.getText().toString();
      Double numGente = Double.parseDouble(valorGente);
      Double numMinuto = Double.parseDouble(valorMinutos);
      Double numDia = Double.parseDouble(valorDia);
      Double calculoDia;
      calculoDia = numGente * numMinuto * (6.94 / 60) * numDia * 322;
      String dia = String.format("%.2f",calculoDia);
      textTotal.setText(dia);
  }

}
