package Main;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
    Scanner leer = new Scanner (System.in); 
    int [] numeros = new int [5];
     boolean X= true;
     int contador=0;
     int opc=0;
    while(X) {
        System.out.println("MENU");
        System.out.println(" Elija una opcion: ");
        System.out.println("[1] Insertar Datp");
        System.out.println("[2] Eliminar Dato");
        System.out.println("[3] Mostrar");
        System.out.println("[4] Salir");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                System.out.println("inserte un dato de tipo entero");
                if (contador < 5){ 
                    numeros[contador]= leer.nextInt(); 
                    contador++; 
                }else {
                    System.out.println("El arreglo esta lleno");
                }
                break;
            case 2:
                if(contador == 0){
                    System.out.println("El arreglo esta vacio");
                }else {
                    System.out.println("Dato Eliminado");
                    numeros[contador-1]= 0;
                    contador--; 
                }
                break;
            case 3:
                System.out.println("Datos:");
                for (int j = numeros.length-1; j>=0; j--) {
                    System.out.println(numeros[j]);
                }
                break;
            case 4:
                 X= false;
                System.out.println("");
                break;
                
            default:
                System.out.println("opcion incorrecta");
        }
    } 
   
}
}
