package wcm.jcrogar.fca.wcm;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
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

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragment1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment1 extends Fragment {
    EditText textGente, textMinutos, textDia, textSemana, textMes, textProblema, textMejora, textTiempoMejora ;
    TextView textTotal, textTotalMejora;
    Button btnCalculatAct;

    //Variables para Graficar
    private BarChart barChart;
    private  String[]months = new String[] {"Enero","Febrero","Marzo","Abril","Mayo"};
    private int[]sale = new int[]{25,20,38,15};
    private int[]colors = new int[]{Color.BLACK,Color.RED,Color.GREEN,Color.BLUE, Color.GRAY};
    //Variables para Graficar


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast toast1 = Toast.makeText(getActivity(),"Recuerda llenar solo una opcion, En cada cuanto se realiza esta actividad", Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.CENTER, 0, 0);
        toast1.show();

        // Inflate the layout for this fragment
        //View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        barChart = (BarChart)v.findViewById(R.id.barChart);  //Variable para redireccionar el Bar Chart

        textProblema = (EditText) v.findViewById(R.id.textProblema);
        textMejora = (EditText) v.findViewById(R.id.textMejora);
        textTiempoMejora = (EditText) v.findViewById(R.id.textTiempoMejora);
        textTotalMejora = (TextView) v.findViewById(R.id.textTotalMejora);
        textGente = (EditText) v.findViewById(R.id.textGente);
        textMinutos = (EditText) v.findViewById(R.id.textMinutos);
        textDia = (EditText) v.findViewById(R.id.textDia);
        textSemana = (EditText) v.findViewById(R.id.textSemana);
        textMes = (EditText) v.findViewById(R.id.textMes);
        textTotal = (TextView) v.findViewById(R.id.textTotal);
        btnCalculatAct = (Button)v.findViewById(R.id.btnCalcularAct);
        textTiempoMejora.setFocusable(false);
        textTiempoMejora.setEnabled(false);
        textTiempoMejora.setCursorVisible(false);
        textTiempoMejora.setKeyListener(null);
        //Llamada a la creacion de la grafica
        createCharts();



        btnCalculatAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar();
                calcularCosto();
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

  public void calcularCosto()
  {
      if (textProblema.getText().toString().length() == 0  && textMejora.getText().toString().length()==0 && textMes.getText().toString().length() == 0)
      {
          Toast toast1 = Toast.makeText(getActivity(),"Ingrese Datos en Analisis del Prpblema o Implementacion de la mejora", Toast.LENGTH_LONG);
          toast1.setGravity(Gravity.CENTER, 0, 0);
          toast1.show();
          textTotalMejora.setText("0.00");
      }else
          {
          String valorProblema = textProblema.getText().toString();
          String valorMejora = textMejora.getText().toString();
          Double numProblema = Double.parseDouble(valorProblema);
          Double numMejora = Double.parseDouble(valorMejora);
          Double CalculoMejora;
          Double TotalMejora;
          CalculoMejora = numProblema + numMejora;
          TotalMejora = CalculoMejora * 0.12;
          String Total = String.format("%.2f", TotalMejora);
          String mejora = String.format("%.2f", CalculoMejora);
          textTiempoMejora.setText(mejora);
          textTotalMejora.setText(Total);
          }
  }

  //Creando la Grafica

    private Chart getSameChart(Chart chart, String description, int textColor, int background, int animateY  ){
        chart.getDescription().setText(description);
        chart.getDescription().setTextColor(textColor);
        chart.getDescription().setTextSize(15);
        chart.setBackgroundColor(background);
        chart.animateY(animateY);
        legend(chart);
        return chart;
    }

    private void legend(Chart chart){
        Legend legend = chart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        ArrayList<LegendEntry> entries = new ArrayList<>();
        for (int i = 0; i<months.length; i++){
            LegendEntry entry = new LegendEntry();
            entry.formColor=colors[i];
            entry.label=months[i];
            entries.add(entry);
        }
        legend.setCustom(entries);

    }

    private ArrayList<BarEntry>getBarEntries(){
        ArrayList<BarEntry> entries = new ArrayList<>();
        for (int i = 0; i<sale.length; i++)
            entries.add(new BarEntry(i,sale[i]));


        return entries;
    }

    private void axisX(XAxis axis){
        axis.setGranularityEnabled(true);
        axis.setPosition(XAxis.XAxisPosition.BOTTOM);
        axis.setValueFormatter(new IndexAxisValueFormatter(months));
        //Para titulos
        //axis.setEnabled(false);
    }

    private void axisLeft(YAxis axis){
        axis.setSpaceTop(30);
        axis.setAxisMinimum(0);
        //axis.setGranularity(20); para ir de 20, 40, 60

    }

    private void axisRight(YAxis axis){
        axis.setEnabled(false);
    }

    public void createCharts() {
        barChart = (BarChart) getSameChart(barChart, "Series", Color.RED, Color.CYAN, 3000);
        barChart.setDrawGridBackground(true);
        barChart.setDrawBarShadow(true);
        barChart.setData(getBarData());
        barChart.invalidate();
        axisX(barChart.getXAxis());
        axisLeft(barChart.getAxisLeft());
        axisRight(barChart.getAxisRight());
        //Para leyenda de colores
        barChart.getLegend().setEnabled(false);
    }

    private DataSet getData(DataSet dataSet){
        dataSet.setColors(colors);
        dataSet.setValueTextColor(Color.WHITE);
        dataSet.setValueTextSize(10);
        return dataSet;
    }

    private BarData getBarData(){
        BarDataSet barDataSet = (BarDataSet)getData(new BarDataSet(getBarEntries(),""));
        barDataSet.setBarShadowColor(Color.GRAY);
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.45f);
        return barData;
    }




}
