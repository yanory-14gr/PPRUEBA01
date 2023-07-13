
package agencia;

import java.util.logging.Logger;


public class Vehiculo {
    
    String Placa;
    String Modelo;
    boolean Extras;
    float PrecVehiculo;
    String color;

    public Vehiculo() {
    }

 
    
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public boolean isExtras() {
        return Extras;
    }

    public void setExtras(boolean Extras) {
        this.Extras = Extras;
    }

    public float getPrecVehiculo() {
        return PrecVehiculo;
    }

    public void setPrecVehiculo(float PrecVehiculo) {
        this.PrecVehiculo = PrecVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
