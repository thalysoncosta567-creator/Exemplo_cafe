/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;



public class CafeSimples implements Bebida{
    double qnt=250;
    @Override
    public String nome(){
        return "cafe";
    }
    
    @Override
    public double qnt(){
        return qnt;

    }   
    
    
    Adicional a = new Adicional();
}
