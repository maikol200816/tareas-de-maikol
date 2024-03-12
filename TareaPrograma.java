/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprograma;

import java.math.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TareaPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int PrimerNumero;
        
          System.out.println ("Escribe el primer numero");
          Scanner leerPrimerNumero=new Scanner(System.in);
          PrimerNumero=leerPrimerNumero.nextInt();
          
          int SegundoNumero;
          System.out.println ("Escribe el segundo numero");
          Scanner leerSegundoNumero=new Scanner(System.in);
          SegundoNumero=leerSegundoNumero.nextInt();
          int c,d,e,f;
        c=PrimerNumero+SegundoNumero;
        d=PrimerNumero-SegundoNumero;
        e=PrimerNumero*SegundoNumero;
        f=Math.max(PrimerNumero, SegundoNumero);
        System.out.println("el primer numero es" + PrimerNumero);
        System.out.println("El segundo  numero es" + SegundoNumero);
        System.out.println("el resultado de la suma es"+c);
        System.out.println("el resultado de la resta es"+d);
        System.out.println("el resultado de la multiplicacion es"+e);
        System.out.println("el valor maximo es"+f);
        
        
       
        
        
        
                
        
    }
    
}
