package gami4;

public class Vehículo {

    private static double Consumo = 0.08; // 8 litros cada 100 kilómetros
    private double Depósito;
    private char [] Matrícula;

    public Vehículo(String Matrícula) {
        Depósito = 0;
        this.Matrícula = Matrícula.toCharArray();
    }

    public void Reposta(double d) {
        Depósito = Depósito + d;
    }

    public double Viaja(double km) {
        double Gasto = km * Consumo;
        if (Gasto>Depósito) {
            System.out.println("No se pueden viajar los kilómetros indicados con "+Depósito+" litros de combustible.");
            return 0;
        } else {
            Depósito = Depósito - Gasto;
            return Gasto;
        }
    }

    public double EstimaciónDistancia() {
        double km = Depósito / Consumo;
        return km;
    }

    @Override
    public String toString() {
        return "La matrícula del vehículo es " + new String(Matrícula) + ", tiene " + Depósito + " litros de combustible y con esto puede recorrer " + EstimaciónDistancia();
    }

    public static boolean Equals(Vehículo x, Vehículo y) {
        return (x.Matrícula == y.Matrícula);
    }
}