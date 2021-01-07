package audio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.awt.Graphics;
//import java.awt.Point;
//import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;  



/**
 *
 * @author Gaby
 */
@ManagedBean
public class grafico { 

    private LineChartModel linealModel;
    LineChartModel model = new LineChartModel();
    LineChartSeries serie = new LineChartSeries();

    public LineChartModel getLinealModel() {
        return linealModel;
    }

    public void setLinealModel(LineChartModel linealModel) {
        this.linealModel = linealModel;
    }

    @PostConstruct
    public void init() {
        crearLineaModel();
    }

    private LineChartModel iniciarModeloLinear() {
        serie.setLabel("Gaby");
        //serie.setDisableStack(true);
        for (int i = 0; i < 12; i++) {
            int intRamdon = (int) (Math.random() * 5);
            serie.getData().put(i, intRamdon);
        }
        model.addSeries(serie);
        return model;
    }

    Axis yAxis;
    Axis xAxis;
    private void crearLineaModel() {
        linealModel = iniciarModeloLinear();
      //  linealModel = new LineChartModel();
        linealModel.setTitle("Audiometría");
        linealModel.setLegendPosition("e"); //east e, north n, south s
        
        yAxis= linealModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(12);
        yAxis.setTickFormat("%d");
        yAxis.setLabel("Deciveles");
        

        xAxis= linealModel.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(12);
        xAxis.setTickFormat("%d");
        xAxis.setLabel("Fuerza");

    }
//    private void trazo (){
//     String x = Math.round(xAxis[0].value);
//     String y = Math.round(xAxis[0].value);
//     
//     String x = Math.round(0)
//     
//                    y = Math.round(e.yAxis[0].value),= Math.round(e.yAxis[0].value),
//                    series = this.series[0];= this.series[0];
//
//                // Add it// Add it
//                series.addPoint([x, y]);.addPoint([x, y]);
//    }
    /////////////////
}
