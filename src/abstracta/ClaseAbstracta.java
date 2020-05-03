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
public abstract class ClaseAbstracta {//es abstracta por que almenos tiene un metodo abstracto
    
    //seccion de atributos
    private int x;
    protected String nombre;
    public float valor;

    public ClaseAbstracta() {
    }
    
    //metodo abstracto
    public abstract double calcularArea();
    
    //la clase abstract, no puede instanciarse
}
