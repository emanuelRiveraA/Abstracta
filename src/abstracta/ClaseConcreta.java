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
public class ClaseConcreta extends ClaseAbstracta{
    
    private int v;

    public ClaseConcreta() {
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public String devolverNombre(String n){
        return nombre + " " +  n;
    };
    
    @Override
    public double calcularArea() {

        return v;
    }
}
