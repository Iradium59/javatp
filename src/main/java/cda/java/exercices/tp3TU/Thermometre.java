package cda.java.exercices.tp3TU;

public class Thermometre {

    public int getTemperatureProcheDeZero(int[] temperatures) {
        if (temperatures.length == 0) {
            return 0;
        }

        int temperatureProcheDeZero = temperatures[0];

        for (int temperature : temperatures) {
            // On compare la valeur absolue de chaque température
            if (Math.abs(temperature) < Math.abs(temperatureProcheDeZero)
                    || (Math.abs(temperature) == Math.abs(temperatureProcheDeZero) && temperature > 0)) {
                temperatureProcheDeZero = temperature;
            }
        }

        return temperatureProcheDeZero;
    }
}

