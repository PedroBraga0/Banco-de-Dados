/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_01;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class Exercicio_01 {

     
    
    public static void main(String[] args) throws IOException {
        String s = "";
        float nota1 = 0;float nota2=0;float media= 0;
        int freq = 0;
        DataInputStream dado;

        
        System.out.println ("ENTRE COM A NOTA 1: ");
        dado = new DataInputStream(System.in);
        
        s = dado.readLine();
        nota1= Float.parseFloat(s);
        
        System.out.println("Entre com a nota 2: ");
        dado = new DataInputStream(System.in);
        
         s = dado.readLine();
         nota2= Float.parseFloat(s);
         
         media = (nota1 + nota2) / 2;
         System.out.println(media);
         
         if(media >= 7 && media <= 75){
             System.out.println("VOCÊ ESTÁ APROVADO! ");
         } else 
             System.out.println("VOCÊ ESTA REPROVADO BESTA");
         
    }
    
}
