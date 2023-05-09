/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Cadastro.Pessoa;


public class Conta {
    private Pessoa titular;
    private int agencia, numeroConta;
    private float saldo;

    public Conta(Pessoa titular, int agencia, int numeroConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        saldo = 0;
    }
    
    public float adicionaSaldo(float valor){
        saldo += valor;
        return saldo;
    }
    
    
    public void removeSaldo(float valor){
        saldo -= valor;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
