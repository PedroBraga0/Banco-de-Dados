/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_segunda06;

import java.io.DataInputStream;
import java.io.IOException;

public class Exercicio_segunda06 {
    public static void main(String[] args) throws IOException {
        String nota = "";
       float notas [] = new float [4];
       float calc_media = 0;
       float somatotal = 0; 
       int freq = 0;
       DataInputStream dado;
       
       for ( int i = 0; i < notas.length;i++) {
                  System.out.println(" DIGITE A NOTA " + (i + 1) );
           dado = new DataInputStream(System.in);
           nota = dado.readLine();
           notas [i] = Float.parseFloat(nota); 
            somatotal = somatotal + notas [i];
         }
              
           calc_media = somatotal / notas.length;
           System.out.println(" Qual a frequencia do aluno? ");
           dado = new DataInputStream(System.in);
           nota = dado.readLine();
           freq = Integer.parseInt(nota); 
                  
           if(calc_media >= 7 && freq >= 75){
               System.out.println("ALUNO APROVADO");
           } else {
               System.out.println("ALUNO REPROVADO");
           }
        }
            
    }
    

