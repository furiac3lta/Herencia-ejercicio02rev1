package modelo;

import java.util.Scanner;

public abstract class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    Scanner scanner = new Scanner(System.in);
    int precioConsumo;
    int precioPeso;
    int precioVenta;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{"
                + "precio=" + precio
                + ", color='" + color + '\''
                + ", consumo='" + consumo + '\''
                + ", peso=" + peso
                + '}';
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            consumo = letra;
        } else {
            consumo = 'F';
        }
        return consumo;
    }

    public String comprobarColor(String color) {
        String color1;
        if (color.equalsIgnoreCase("blanco")
                || color.equalsIgnoreCase("azul")
                || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo")
                || color.equalsIgnoreCase("gris")) {
            color1=color;
        } else {
            color1 = "blanco";
        }
        return color1;
    }

    public int precioPorPeso() {
        if (peso >= 1 && peso <= 19) {
            precioPeso = 100;
        } else if (peso >= 20 && peso <= 49) {
            precioPeso = 500;
        } else if (peso >= 50 && peso <= 79) {
            precioPeso = 800;
        } else if (peso >= 80) {
            precioPeso = 1000;
        }
        return precioPeso;
    }



    public int precioFinal() {
        switch (consumo) {
            case 'A':
                precioConsumo = 1000;
                precioVenta = 1000 + precioConsumo + precioPorPeso();
                break;
            case 'B':
                precioConsumo = 800;
                precioVenta = 1000 + precioConsumo + precioPorPeso();
                break;
            case 'C':
                precioConsumo = 600;
                precioVenta = 1000 + precioConsumo + precioPorPeso();
                break;
            case 'D':
                precioConsumo = 500;
                precioVenta = 1000 + precioConsumo + precioPorPeso();
                break;
            case 'E':
                precioConsumo = 300;
                precioVenta = 1000 + precioConsumo + precioPorPeso();
                break;
            case 'F':
                precioConsumo = 100;
                precioVenta = 1000 + precioConsumo + precioPorPeso();
                break;
        }
        return precioVenta;
    }
    public void crearElectrodomestico() {

        System.out.println("ingrese color");
        String color = scanner.next();
        this.color = comprobarColor(color);
        System.out.println("ingrese consumo");
        char consumo = scanner.next().charAt(0);
        this.consumo = comprobarConsumoEnergetico(consumo);
        System.out.println("ingrese el peso");
        this.peso = scanner.nextInt();
        this.precio = precioFinal();
    }
    public abstract Lavadora crearLavadora();
    public abstract Televisor crearTelevisor();

}


