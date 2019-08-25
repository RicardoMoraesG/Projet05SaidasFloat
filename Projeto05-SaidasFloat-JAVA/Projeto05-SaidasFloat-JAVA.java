/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author aluno
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //definir uma variavel em java (TIPO NOME);
    int idade; //declaração da variavel
    idade = 30; // inicialização da variável
    int novaIdade = 35; // declara e inicializa 
    
    //operadores + - / *
    idade = idade + 10;
    int divisao = 11 / 2;
    int modulo = 11 % 2;
    
    System.out.println("Idade " +idade);
    // sout + tabz   
    //double e float
    double pi = 3.14;
    int x = 20 ;
    x = x / 3;
    System.out.println("valor de x: " +x);
         
    boolean menorIdade = idade < 18; // retorna true ou false
    System.out.println ("Menor idade: " +menorIdade);
    
    char letraA= 'a';
    System.out.println("Letra A: " + letraA);

    }}