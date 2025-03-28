/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1.pkg0;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Escola {
   
    private Aluno aluno; 

    public void cadastrarAluno() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();
            
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a nota da primeira prova: ");
            double notaProva1 = scanner.nextDouble();
            
            System.out.print("Digite a nota da segunda prova: ");
            double notaProva2 = scanner.nextDouble();
            
            System.out.print("Digite a nota do trabalho: ");
            double notaTrabalho = scanner.nextDouble();
            
            aluno = new Aluno(matricula, nome, notaProva1, notaProva2, notaTrabalho);
        }
    }

    public void exibirResultadoAluno() {
        if (aluno != null) {
            aluno.exibirResultado();
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }
    
     public static void main(String[] args) {
        Escola escola = new Escola(); 
        escola.cadastrarAluno(); 
        escola.exibirResultadoAluno(); 
    }
    }

