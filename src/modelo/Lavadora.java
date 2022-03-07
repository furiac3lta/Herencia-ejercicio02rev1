package modelo;

public class Lavadora extends Electrodomestico {
    int carga1;
    int carga, preciolavadora;
    public Lavadora(){
    }
    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
public int precioLavadora(int carga){

        return preciolavadora;
}
    @Override
    public Lavadora crearLavadora(){
        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        System.out.println("ingresa carga:");
        carga = scanner.nextInt();
        if(carga>30){
           preciolavadora = lavadora.getPrecio() + 500;
           lavadora.setPrecio(preciolavadora);

        }else{
            preciolavadora = lavadora.getPrecio();
            lavadora.setPrecio(preciolavadora);
        }
        lavadora.setCarga(carga);
        return lavadora;
    }
}
