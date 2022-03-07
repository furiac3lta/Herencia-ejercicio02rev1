package programa;
import modelo.Electrodomestico;
import modelo.Lavadora;


public class Programa {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora=lavadora.crearLavadora();
        System.out.println(lavadora.toString());

    }
}