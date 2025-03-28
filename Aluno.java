/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1.pkg0;

/**
 *
 * @author aluno
 */
public class Aluno {
  
    private final String matricula;
    private final String nome;
    private final double notaProva1;
    private final double notaProva2;
    private final double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
    }

    public boolean aprovacao() {
        return calcularMedia() >= 6;
    }

    public void exibirResultado() {
        double media = calcularMedia();
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média Final: " + media);
        System.out.println("Status: " + (aprovacao() ? "APROVADO" : "REPROVADO"));
    }
}

