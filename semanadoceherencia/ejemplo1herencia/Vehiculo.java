package semanadoceherencia.ejemplo1herencia;

public class Vehiculo {
       
    protected String marca;
    protected int velocidad;
 
    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }
 
    public void acelerar() {
        velocidad += 10;
    }
 
    public String info() {
        return "Vehículo " + marca + " velocidad " + velocidad + " km/h";
    }
}

