package com.xworkz.TypeCasting;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Upcasting\n");
		
		int studentScore = 90;
        double studentAverageScore = studentScore; 
        System.out.println("Upcasted int to double: " + studentAverageScore);

        byte roomHumidityLevel = 55;
        int globalHumidity = roomHumidityLevel; 
        System.out.println("Upcasted byte to int: " + globalHumidity);
 
        short monthlySales = 1500;
        float yearlySales = monthlySales; 
        System.out.println("Upcasted short to float: " + yearlySales);

        int speedInMetersPerSecond = 72; 
        double speedInKilometersPerHour = speedInMetersPerSecond * 3.6; 
        System.out.println("Upcasted int to double: " + speedInKilometersPerHour);
        
        System.out.println("\nDowncasting\n");
        
        double eulerNumber = 2.718281828459045;
        float eulerFloat = (float) eulerNumber; 
        System.out.println("Downcasted double to float: " + eulerFloat);

        float roomTemperature = 128.3f;
        byte temperatureByte = (byte) roomTemperature; 
        System.out.println("Downcasted float to byte: " + temperatureByte);

        int populationInCity = 35000;
        short smallCityPopulation = (short) populationInCity; 
        System.out.println("Downcasted int to short: " + smallCityPopulation);

        long dataTransferSize = 5000000000L;
        int smallDataTransferSize = (int) dataTransferSize;
        System.out.println("Downcasted long to int: " + smallDataTransferSize);
	}
}
