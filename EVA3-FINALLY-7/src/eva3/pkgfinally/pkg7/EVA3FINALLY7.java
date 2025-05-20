/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3.pkgfinally.pkg7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ririo
 */
public class EVA3FINALLY7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner cap = new Scanner(System.in);
            System.out.println("Da un numero entero: ");
            int num = cap.nextInt();
            System.out.println("El numero es: " + num);
        }catch(InputMismatchException e){
            System.out.println("El numero no es un entero");
        }finally{//SIEMPRE SE EJECUTA:
            //BLOQUE DE CODIGO CON INSTRUCCIONES QUE DEBEN EJECUTAR
            //SIN IMPORTAR QUE HAYA O NO EXCEPCIONES
            System.out.println("Esta linea siempre se va a ejecutar");
        }
        System.out.println("x-Se cerrara el programa-x");
    }
    
}
