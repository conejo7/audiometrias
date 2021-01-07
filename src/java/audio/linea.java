/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Gaby
 */

import org.primefaces.model.chart.LineChartModel;
import javax.annotation.PostConstruct;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;


@ManagedBean

public class linea {
    
    
        private LineChartModel lineModel1;
        private LineChartModel lineModel2;
        private LineChartModel zoomModel;
         
    @PostConstruct
    public void init() {
        createLineModels();
        createLineModels1();
    }
    
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
 
    public LineChartModel getLineModel2() {
        return lineModel2;
    }
 
    public LineChartModel getZoomModel() {
        return zoomModel;
    }
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series");
 
        series1.set(null, null);
        
        series1.set(3, 4);
//        series1.set(3, 3);
//        series1.set(4, 6);
//        series1.set(5, 8);
 
//        LineChartSeries series2 = new LineChartSeries();
//        series2.setLabel("Series 2");
// 
//        series2.set(1, 6);
//        series2.set(2, 3);
//        series2.set(3, 2);
//        series2.set(4, 7);
//        series2.set(5, 9);
 
        model.addSeries(series1);
       // model.addSeries(series2);

        return model;
    }
        
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Prueba - Odido Derecho");
        lineModel1.setLegendPosition("n");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(12);
        yAxis.setTickFormat("%d");
        yAxis.setLabel("Deciveles");
        yAxis.setTickInterval("2");
        
       // lineModel2 = initLinearModel();
        
        Axis xAxis= lineModel1.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(12);
        xAxis.setTickFormat("%d");
        xAxis.setLabel("Fuerza");

 
//        lineModel2 = initCategoryModel();
//        lineModel2.setTitle("Category Chart");
//        lineModel2.setLegendPosition("n");
//        lineModel2.setShowPointLabels(false);
//        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Years"));
//        yAxis = lineModel2.getAxis(AxisType.Y);
//        yAxis.setLabel("Births");
//        yAxis.setMin(0);
//        yAxis.setMax(20);
//        
// 
//        zoomModel = initLinearModel();
//        zoomModel.setTitle("Zoom");
//        zoomModel.setZoom(true);
//        zoomModel.setLegendPosition("e");
//        yAxis = zoomModel.getAxis(AxisType.Y);
//        yAxis.setMin(0);
//        yAxis.setMax(10);
    }  
     private void createLineModels1() {
        lineModel2 = initLinearModel();
        lineModel2.setTitle("Prueba - Odido Izquierdo");
        lineModel2.setLegendPosition("n");
        Axis yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(12);
        yAxis.setTickFormat("%d");
        yAxis.setLabel("Deciveles");
        yAxis.setTickInterval("2");
        
       // lineModel2 = initLinearModel();
        
        Axis xAxis= lineModel2.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(12);
        xAxis.setTickFormat("%d");
        xAxis.setLabel("Fuerza");
     }
    
    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 90);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
 
        return model;
    }
 
}

