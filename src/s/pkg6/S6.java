/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.pkg6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("EJERCICIO 06");
       System.out.println("");
       
        
        // TODO code application logic here
       String nombre01= "";
       int cantidad01=0;
       double precio01=0;
       //
       String nombre02= "";
       int cantidad02=0;
       double precio02=0;
       
       String nombre03= "";
       int cantidad03=0;
       double precio03=0;
       
       Scanner sc  = new Scanner(System.in);
       
       
       System.out.println("ingrese\"nombre\"producto01 :");
       nombre01=sc.next();
       
       System.out.println("ingrese\"cantidad\"producto01 :");
       cantidad01=sc.nextInt();
        
       System.out.println("ingrese\"precio\"producto01 :");
       precio01=sc.nextDouble();
       
       System.out.println("ingrese\"nombre\"producto02 :");
       nombre02=sc.next();
       
       System.out.println("ingrese\"cantidad\"producto02 :");
       cantidad02=sc.nextInt();
        
       System.out.println("ingrese\"precio\"producto02 :");
       precio02=sc.nextDouble();
        
       System.out.println("ingrese\"nombre\"producto03 :");
       nombre03=sc.next();
       
       System.out.println("ingrese\"cantidad\"producto03 : ");
       cantidad03=sc.nextInt();
        
       System.out.println("ingrese\"precio\"producto03 : ");
       precio03=sc.nextDouble();
        
       double subtotal = 0;
       
       subtotal += cantidad01 * precio01;
       subtotal += cantidad02 * precio02;
       subtotal += cantidad03 * precio03;   
        
       double impuesto=subtotal* 0.18;
       
       double total=subtotal + impuesto;
       
       System.out.println("el total es: " + total);
    }
    
}
