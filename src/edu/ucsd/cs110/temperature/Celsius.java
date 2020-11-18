package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    private boolean toFahrenheit = false;

    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        toFahrenheit = true;
        return new Celsius((this.getValue()*9/5)+32);
    }

    public String toString()
    {
        String beginning = "" + this.getValue();
        String ending = " C";
        return beginning+ending;
    }
}