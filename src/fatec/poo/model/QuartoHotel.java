/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author gusta
 */
public class QuartoHotel {
    
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    public void reservar(int r)
    {
    numRG = r; // numero do RG do solicitante
    situacao = true; //quarto está reservado
    
    }
    
    public double liberar(int lib)
    {
     double d;
     
     d = lib * valorDiaria;
     
     totalFaturado += d;
     situacao = false;
    
    return d; //remover depois
    }

    public int getNumRG() {
        return numRG;
    }
            
    
    
    
    
}
