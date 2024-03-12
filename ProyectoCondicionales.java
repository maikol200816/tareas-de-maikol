/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocondicionales;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a,b,c;
        System.out.println("ingresar el dato a");
        Scanner leerDatoa=new Scanner(System.in);
        a= leerDatoa.nextDouble();
        System.out.println("ingresar el dato b");
        Scanner leerDato= new Scanner(System.in);
        b= leerDato.nextDouble();
        if(a>b){
                    c=a/b;
                         System.out.println("El resultado de la division es"+c);
   
    }   

        else{
        System.out.println("no se puede realizar la division");
            }
    }
    
}
