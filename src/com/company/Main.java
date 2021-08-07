package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("B2BTUR01_07_2019.csv");

        List<DataValue> dataList = new ArrayList<>();

        Scanner scanner = new Scanner(file);

        String[] readLine;

        scanner.nextLine();

        while (scanner.hasNextLine()) {

            readLine = scanner.nextLine().split(",");
            dataList.add(DataParser.parsedData(readLine));

        }

        printData(dataList);


    }


    public static void printData(List<DataValue> dataList) {

        int length = 70;
        String separator = "";

        for (int i = 0; i < length; i++) {
            separator += "-";
        }

        System.out.println(separator + "\n" +
                "Welcome to the application for Meteorological Data Analysis.\n" +
                separator + "\n" +
                "We have " + dataList.size() + " meteorological daily records to analyze.\n" +
                "Average temperature for the reporting period: " + DataAnalyzer.reportAverageTemperature(dataList) + "\n" +
                "Maximum temperature for the reporting period: " + DataAnalyzer.reportMaximumTemperature(dataList) + "\n" +
                "Minimum temperature for the reporting period: " + DataAnalyzer.reportMinimumTemperature(dataList) + "\n" +
                "Number of windy days: " + DataAnalyzer.reportWindyDays(dataList) + "\n" +
                "Number of calm days: " + DataAnalyzer.reportCalmDays(dataList) + "\n" +
                "Precipitation summary in month decades: " + DataAnalyzer.reportSummaryPrecipitation(dataList) + "\n" +
                separator + "\n" +
                DataGraph.printGraph(dataList) + "\n" +
                separator);
    }

}
