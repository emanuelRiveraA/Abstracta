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
public class OtraClaseConcreta extends ClaseAbstracta{

    @Override
    public double calcularArea() {
        return valor;
    }
    
    public double calcularArea(float o ){
        return o * valor;
    }
}
