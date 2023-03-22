package lesson1;

public interface Converter {
    public double convert(double celsius);
}

class ToFahrenheit implements Converter {
    @Override
    public double convert(double celsius) {
       return (celsius * 1.8) + 32;
    }
}

class ToKelvin implements Converter {
    @Override
    public double convert(double celsius) {
       return celsius + 273.15;
    }
}

