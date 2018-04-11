package wcm.jcrogar.fca.wcm;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;

public class pruebaGrafica extends AppCompatActivity {
    private PieChart pieChart;
    private BarChart barChart;
    private  String[]months = new String[] {"Enero","Febrero","Marzo","Abril","Mayo"};
    private int[]sale = new int[]{25,20,38,15};
    private int[]colors = new int[]{Color.BLACK,Color.RED,Color.GREEN,Color.BLUE, Color.GRAY};
    //EditText Calculo; //Prueba para agregar Grafica

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_grafica);
        barChart = (BarChart)findViewById(R.id.barChart);
        pieChart = (PieChart) findViewById(R.id.pieChart);
        //Calculo = (EditText) findViewById(R.id.textTotal);
        createCharts();
        //https://github.com/codigofacilito/Graficas-Android
    }
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
    private ArrayList<PieEntry>getPieEntries(){
        ArrayList<PieEntry> entries = new ArrayList<>();
        for (int i = 0; i<sale.length; i++)
            entries.add(new PieEntry(sale[i]));
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

    public void createCharts(){
        barChart=(BarChart)getSameChart(barChart,"Series",Color.RED,Color.CYAN,3000);
        barChart.setDrawGridBackground(true);
        barChart.setDrawBarShadow(true);
        barChart.setData(getBarData());
        barChart.invalidate();
        axisX(barChart.getXAxis());
        axisLeft(barChart.getAxisLeft());
        axisRight(barChart.getAxisRight());
        //Para leyenda de colores
        barChart.getLegend().setEnabled(false);

        pieChart=(PieChart)getSameChart(pieChart,"Ventas",Color.GRAY,Color.MAGENTA,3000);
        pieChart.setHoleRadius(10);
        pieChart.setTransparentCircleRadius(12);
        pieChart.setData(getPieData());
        pieChart.invalidate();
        pieChart.setDrawHoleEnabled(false);
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

    private PieData getPieData(){
        PieDataSet pieDataSet = (PieDataSet)getData(new PieDataSet(getPieEntries(),""));
        pieDataSet.setSliceSpace(2);
        pieDataSet.setValueFormatter(new PercentFormatter());
        return new PieData(pieDataSet);
    }


}
