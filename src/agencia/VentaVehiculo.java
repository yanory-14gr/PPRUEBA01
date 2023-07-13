
package agencia;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VentaVehiculo {
    
    public void venta(Vehiculo matCarros[][]){
        
        for(int fila=0; fila<matCarros.length; fila++){
              for(int columna=0; columna<matCarros[fila].length; columna++){
                  matCarros[fila][columna] = new Vehiculo();
                  matCarros[fila][columna].setPlaca(JOptionPane.showInputDialog("Ingrese la placa del vehiculo"));
                  matCarros[fila][columna].setModelo(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"));
                  matCarros[fila][columna].setColor(JOptionPane.showInputDialog("Ingrese el color del vehiculo"));
                  matCarros[fila][columna].setPrecVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del vehiculo")));
                  byte extra =Byte.parseByte(JOptionPane.showInputDialog(" 1.Extra\n 2.Sin extra\n Digite una opcion."));
                    if(extra ==1)
                    matCarros[fila][columna].setExtras(true);
                else
                    matCarros[fila][columna].setExtras(false);
        }//cierra for
        }//cierra for       
    }//cierra metodo
    
    public void Impventa(Vehiculo matCarros[][]){
        
        System.out.println("AUTOS VENDIDOS");
        for(int fila=0; fila<matCarros.length; fila++){
              for(int columna=0; columna<matCarros[fila].length; columna++){
                   System.out.println("Placa: " + matCarros[fila][columna].getPlaca());
                   System.out.println("Modelo: " + matCarros[fila][columna].getModelo());
                   System.out.println("Precio: " + matCarros[fila][columna].getPrecVehiculo());
                   System.out.println("Color: " + matCarros[fila][columna].getColor());
                   if(matCarros[fila][columna].isExtras()==true)
                       System.out.println("Tiene extras");
                else
                       System.out.println("No tiene extras");

              }//cierra for
              
        }//cierra for      
}//cierra ImpVenta 

    
    public void CarrosconExtra(Vehiculo matCarros[][]){
        
        System.out.println("AUTOS QUE TIENEN EXTRAS");
        for(int fila=0; fila<matCarros.length; fila++){
              for(int columna=0; columna<matCarros[fila].length; columna++){
                    if(matCarros[fila][columna].isExtras()==true)
                   System.out.println("Placa: " + matCarros[fila][columna].getPlaca());
                   System.out.println("Modelo: " + matCarros[fila][columna].getModelo());
                   System.out.println("Precio: " + matCarros[fila][columna].getPrecVehiculo());
                   System.out.println("Color: " + matCarros[fila][columna].getColor());
                  

              }//cierra for
              
        }//cierra for      
}//cierra Carros con extra

    public void CarrosMayor(Vehiculo matCarros[][]){
        
        System.out.println("AUTOS MAYORES A 25 MILLONES DE COLONES");
        float precio = matCarros[0][0].getPrecVehiculo();
        int i=0, j=0;
        for(int fila=0; fila<matCarros.length; fila++){
              for(int columna=0; columna<matCarros[fila].length; columna++){
                    if(matCarros[fila][columna].getPrecVehiculo()>precio){
                        precio= matCarros[fila][columna].getPrecVehiculo();
                        i=fila;
                        j=columna;
                  
                }//cierra if
                    
           }//cierra for
              
        }//cierra for    
                   System.out.println("Placa: " + matCarros[i][j].getPlaca());
                   System.out.println("Modelo: " + matCarros[i][j].getModelo());
                   System.out.println("Precio: " + matCarros[i][j].getPrecVehiculo());
                   System.out.println("Color: " + matCarros[i][j].getColor());
                   
    }//cierra Carros con extra
    
}//cierra clase
