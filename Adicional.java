/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

/**
 *
 * @author aluno9
 */
public abstract class Adicional implements Bebida{
    Bebida bebida;
    public Adicional(Bebida a){
        this.bebida = a;
    }
}
