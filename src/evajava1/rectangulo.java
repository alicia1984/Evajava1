 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evajava1 ;
import java.util.Scanner;
    /*******************************************************************************
     *Alicia Villarroel
     * @author LP 13
     * Fecha:Octubre 30 de 20017
     * Programa: pruebajava1
     * Responsabilidad: calcular  el area del  triangulo
     *****************************************************************************/
public class rectangulo
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


// TODO code application logic hereç
       float area, base, altura;//paso2
      Scanner sc = new Scanner(System.in);//paso3
      System.out.println("ingrese el  numero  de la  base  de  su rectangulo");//paso 4 
      base= sc.nextFloat();//leo y guardo los  datosde entrada
       System.out.println("ingrese el numero altura de  su rectangulo");
       altura=sc.nextFloat();
       //paso 5 
       area = base*altura; 
 System.out.println ("elarea  de su rectangulo  es : "+area+"mts2S");
   
       
       
    
    }
}