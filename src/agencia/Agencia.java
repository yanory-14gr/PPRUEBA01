
package agencia;

import javax.swing.JOptionPane;


public class Agencia {

    public void menu(){
        byte opc=1;
        VentaVehiculo obj = new VentaVehiculo();
        Vehiculo matCarros[][] = new Vehiculo[2][2];
        while (opc>=1 &&opc<4){
           opc =Byte.parseByte(JOptionPane.showInputDialog(" 1.Realizar ventas\n 2.Impresion\n 3.Carros con extras\n 4.Carros mayores a 25 millones\n 5.Salir\n Digite una opcion."));
           switch(opc){
               case 1: obj.venta(matCarros);
               break;
               case 2: obj.Impventa(matCarros);
               break;
               case 3: obj.CarrosconExtra(matCarros);
               break;
               case 4: obj.CarrosMayor(matCarros);
               default: System.out.println("Saliendo del sistema");
           }//cierra switch

        }//cierra while
    }//cierra menu
  
    public static void main(String[] args) {
        Agencia objAgencia = new Agencia();
        objAgencia.menu();

    }//cierra main
    
}//cierra clase
