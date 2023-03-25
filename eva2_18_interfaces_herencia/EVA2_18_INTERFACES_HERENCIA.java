/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_18_interfaces_herencia;

/**
 *
 * @author eduar
 */
public class EVA2_18_INTERFACES_HERENCIA {

    public static void main(String[] args) {
        
    }
}
interface intA{
    public abstract void A();
    
}
interface intB{
    void B();//implicitamente está incluido public abstract
    
}
interface intC extends intA, intB{
    void C();
    
}
class Prueba implements intC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}