package com.example.temperatureconverter;
import java.lang.Math;

public class converterClass {
    public double cel_to_fah(double celsius){

        double cel = (celsius * 1.8) + 32;
        return Math.round(cel);
    }

    public double fah_to_cel(double fahrenheit){

        double fah = (fahrenheit - 32) * 0.56;
        return Math.round(fah);
    }
}
