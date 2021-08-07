package com.company;

import java.util.List;

public class DataGraph {

    public static String printGraph(List<DataValue> dataList) {


        char temperatureRange = '*';
        char space = ' ';
        String lineGraph = "  ";
        String quotas = "   | 00--------10--------20--------30--------40";
        String graph = quotas + "\n";

        for (DataValue d : dataList) {

            for (int i = 0; i <= Math.round(d.getMaxTemperature()); i++) {

                if (i < Math.round(d.getMinTemperature()) - 1) {
                    lineGraph += space;
                }

                if (i >= Math.round(d.getMinTemperature()) && i <= Math.round(d.getMaxTemperature())) {
                    lineGraph += temperatureRange;
                }

            }

            graph += String.format("%02d", d.getDay()) + " |" + lineGraph + "\n";

            lineGraph = "  ";

        }
        graph += quotas;

        return graph;
    }

}
