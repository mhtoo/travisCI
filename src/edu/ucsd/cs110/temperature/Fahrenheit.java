package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{

    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Fahrenheit tempF = new Fahrenheit((this.getValue()-32)*5/9);
        return tempF;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit tempF = new Fahrenheit(this.getValue());
        return tempF;
    }

    public String toString()
    {
        String beginning = "" + this.getValue();
        String ending = " F";
        return beginning+ending;
    }
}