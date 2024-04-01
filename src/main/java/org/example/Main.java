package org.example;

public class Main {
    public static void main(String[] args) {

        //Classe Conta
        Conta conta = new Conta();
        conta.depositarConta(500.00);

        System.out.println(conta.saldoConta());

        conta.sacarConta(100.00);

        System.out.println(conta.saldoConta());

        //Class ContaInvestimento
        ContaInvestimento contaInv = new ContaInvestimento();

        String contaInvesti = contaInv.criarInvestimentoConta(2000.00, "PrevidenciaPrivada");
        System.out.println(contaInvesti);

        contaInv.listaInvestimentoConta();

        //Conta Especial
        ContaEspecial contaEsp = new ContaEspecial();
        boolean situacao = contaEsp.definirCreditoConta(1000.00, 1000.00);
        System.out.println("Situação: " + situacao);

        contaEsp.listarCreditoConta();


    }
}