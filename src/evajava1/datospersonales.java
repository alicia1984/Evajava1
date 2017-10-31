/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;//paquete  para  usar ventanas paso 1
/**
 *Alicia Villarroel
 * @author LP 13
 * Fecha:Octubre 26 de 20017
 * Programa: Clase3A
 * Responsabilidad: clase principal
 * @author LP 13
 */
public class datospersonales {

public static void main (String[] args)

{
//paso2
    String nombre;
    int edad=0;
    int incremento=edad+20;

//paso3
//el show input recibe  datos de  entrada  por  ventana
nombre = JOptionPane.showInputDialog("Digite su nombre ");
edad = Integer.parseInt(JOptionPane.showInputDialog("digite  su edad"));
JOptionPane.showMessageDialog(null, "bienvenido"+nombre+"en 20 años  su edad  sera"+incremento);
}
}

      
