package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(value);

    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((value * 9/5) + 32);
    }

    public String toString()
    {
        return "" + value + " C";
    }
}