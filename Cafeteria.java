/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeteria;

/**
 *
 * @author aluno9
 */
public class Cafeteria {

   
        public static void main(String[] args) {
        Bebida cafezinho = new CafeSimples();
        System.out.println(cafezinho.nome() + "\n" + cafezinho.qnt());
        System.out.println("\nAdicionando Manteiga...\n");
        
        cafezinho = new Leite(cafezinho);
        System.out.println(cafezinho.nome() + "\n" + cafezinho.qnt());
        System.out.println("\nAdicionando leite...\n");
        
        cafezinho = new Chocolate(cafezinho);
        System.out.println(cafezinho.nome() + "\n" + cafezinho.qnt());
    } 
}
    
