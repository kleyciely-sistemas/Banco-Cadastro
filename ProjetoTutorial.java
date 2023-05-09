/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetotutorial;

import Banco.Conta;
import Cadastro.Pessoa;

/**
 *
 * @author kleyc
 */
public class ProjetoTutorial {

    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa("Joao", 25, 250, 1234567890);
        novaPessoa.setNome("Marcos");
        Conta conta1 = new Conta(novaPessoa, 123, 123456);
        System.out.println(conta1.getTitular().getNome());
    }

}
