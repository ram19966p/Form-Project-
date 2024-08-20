
package com.mycompany.studentmanegment;

 import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;
import org.jfree.chart.plot.PlotOrientation;
import javafx.application.Application;
import javafx.stage.Stage;

    
   

public class JFree{

   

public static void main(String arg []){


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "USA", "2021");
        dataset.addValue(3, "India", "2021");
        dataset.addValue(2, "China", "2021");

       JFreeChart barChart = ChartFactory.createBarChart(
    "Population Growth",              // Chart title
    "Country",                        // X-Axis Label
    "Population (millions)",          // Y-Axis Label
    dataset,                          // Dataset (DefaultCategoryDataset)
    PlotOrientation.VERTICAL,         // Plot Orientation (VERTICAL or HORIZONTAL)
    true,                             // Include Legend (true/false)
    true,                             // Tooltips (true/false)
    false                             // URLs (true/false)
);


        ChartPanel chartPanel = new ChartPanel(barChart);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
}
    }



