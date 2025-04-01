/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Principal {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Digite a cor do carro: ");
            String cor = scanner.nextLine();
            
            System.out.print("Digite o ano do carro: ");
            int ano = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Digite a marca do carro: ");
            String marca = scanner.nextLine();
            
            Carro meuCarro = new Carro(modelo, cor, ano, marca);
            System.out.println("\nInformações do carro:");
            meuCarro.exibirInfo();
            
            System.out.print("\nDeseja acelerar (1) ou desacelerar (-1)? ");
            int direcao = scanner.nextInt();
            meuCarro.acelera(direcao);
            
            System.out.println("\nInformações após aceleração/desaceleração:");
            meuCarro.exibirInfo();
            
            System.out.print("\nDeseja frear o carro (Sim = 1, Não = 0)? ");
            int opcaoFreio = scanner.nextInt();
            if (opcaoFreio == 1) {
                meuCarro.freia(); } 
            
            System.out.println("\nInformações após frenagem:");
            meuCarro.exibirInfo();
            
        }
    }
}
    

