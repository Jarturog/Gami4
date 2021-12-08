package gami4;

public class Gami4 {

    public static void main(String[] args) {
        Gami4 g = new Gami4();
        g.Inicio();
    }

    LT lector = new LT();

    public void Inicio() {
        Vehículo Uno = new Vehículo("1234 ABC");
        Vehículo Dos = new Vehículo("5678 DEF");
        Vehículo Tres = new Vehículo("8161 FIP");

        Uno.Reposta(5);
        System.out.println("El vehículo uno puede viajar " + Uno.EstimaciónDistancia() + "km con el combustible que tiene.");
        System.out.println("El vehículo uno ha gastado " + Uno.Viaja(20) + " litros de combustible en el viaje que ha hecho.");
        if (!Vehículo.Equals(Uno, Dos)) {
            System.out.println(Uno + " y " + Dos);
        }
        System.out.println(Uno);
    }
}