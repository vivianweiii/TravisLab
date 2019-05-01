package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((value - 32) *5/9);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(value);
    }

    public String toString()
    {
        return "" + value + " F";
    }
}
