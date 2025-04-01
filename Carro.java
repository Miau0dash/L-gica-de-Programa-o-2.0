/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício2;

/**
 *
 * @author usuario
 */
public class Carro {
   
    
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int velocidade;

    
    public Carro(String modelo, String cor, int ano, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.velocidade = 0; 
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    
    public void acelera(int direcao) {
        if (direcao == 1) {
            velocidade += 5; 
        } else if (direcao == -1) {
            velocidade -= 5; 
            if (velocidade < 0) {
                velocidade = 0; 
            }
        }
    }

    
    public void freia() {
        velocidade = 0;
    }

    
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}

