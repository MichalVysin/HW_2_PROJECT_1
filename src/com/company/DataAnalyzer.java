package com.company;

import java.util.Comparator;
import java.util.List;

public class DataAnalyzer {

    public static String reportAverageTemperature(List<DataValue> dataList) {

        Double output = dataList
                .stream()
                .mapToDouble(DataValue::getAverageTemperature)
                .average()
                .getAsDouble();

        return String.format("%.01f", output).replace(",", ".") + "°C";
    }

    public static String reportMaximumTemperature(List<DataValue> dataList) {

        DataValue output = dataList
                .stream()
                .max(Comparator.comparing(DataValue::getMaxTemperature))
                .get();

        return output.getYear() + "-" +
                String.format("%02d", output.getMonth()) + "-" +
                String.format("%02d", output.getDay()) + " was " +
                output.getMaxTemperature() + "°C";
    }

    public static String reportMinimumTemperature(List<DataValue> dataList) {

        DataValue output = dataList
                .stream()
                .min(Comparator.comparing(DataValue::getMinTemperature))
                .get();

        return output.getYear() + "-" + String.format("%02d", output.getMonth()) +
                "-" + String.format("%02d", output.getDay()) +
                " was " + output.getMinTemperature() + "°C";
    }


    public static int reportWindyDays(List<DataValue> dataList) {

        int output = 0;

        for (DataValue d : dataList) {
            if (d.getWindSpeed() >= 4.2) {
                output++;
            }
        }

        return output;
    }

    public static int reportCalmDays(List<DataValue> dataList) {

        int output = 0;

        for (DataValue d : dataList) {
            if (d.getWindSpeed() <= 1.8) {
                output++;
            }
        }

        return output;
    }

    public static String reportSummaryPrecipitation(List<DataValue> dataList) {

        Double result1 = dataList
                .stream()
                .filter(n -> n.getDay() <= 10)
                .mapToDouble(DataValue::getPrecipitation)
                .sum();

        Double result2 = dataList
                .stream()
                .filter(n -> n.getDay() > 10 && n.getDay() <= 20)
                .mapToDouble(DataValue::getPrecipitation)
                .sum();

        Double result3 = dataList
                .stream()
                .filter(n -> n.getDay() > 20 && n.getDay() <= dataList.size())
                .mapToDouble(DataValue::getPrecipitation)
                .sum();

        return String.format("%.01f", result1).replace(",", ".") + "mm - " +
                String.format("%.01f", result2).replace(",", ".") + "mm - " +
                String.format("%.01f", result3).replace(",", ".") + "mm";


    }
}
