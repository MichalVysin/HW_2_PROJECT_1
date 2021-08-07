package com.company;

public class DataParser {

    public static DataValue parsedData(String[] inputData) {

        DataValue data = new DataValue();

        data.setYear(Integer.parseInt(inputData[0]));
        data.setMonth(Integer.parseInt(inputData[1]));
        data.setDay(Integer.parseInt(inputData[2]));
        data.setAverageTemperature(Double.parseDouble(inputData[3]));
        data.setMaxTemperature(Double.parseDouble(inputData[4]));
        data.setMinTemperature(Double.parseDouble(inputData[5]));
        data.setPressure(Double.parseDouble(inputData[6]));
        data.setWindSpeed(Double.parseDouble(inputData[7]));
        data.setHumidity(Double.parseDouble(inputData[8]));
        data.setPrecipitation(Double.parseDouble(inputData[9]));

        return data;

    }
}
