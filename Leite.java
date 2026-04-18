/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

/**
 *
 * @author aluno9
 */
public class Leite extends Adicional{
    public Leite(Bebida a){
        super(a);   
    }
  
    @Override
    public String nome(){
        return bebida.nome() + "\ncom leite";
    }
    
    @Override
    public double qnt(){
        return bebida.qnt()+  45;
    }
}
