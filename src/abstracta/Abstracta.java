/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Idalia
 */
public class Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instancia de la clase concreta
        ClaseConcreta co = new ClaseConcreta();
        System.out.println(co.devolverNombre("****"));
        
    }
    
}
