package org.example;

public class ContaInvestimento  extends Conta{

    private String tipoInvestimento;

    public ContaInvestimento() {
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    void listaInvestimentoConta() {
        System.out.println("Investimento em " + this.tipoInvestimento);
    }

    String criarInvestimentoConta(double quantidade, String tipoInvestimento) {
        this.saldoConta = this.saldoConta + quantidade;
        this.tipoInvestimento = tipoInvestimento;
        return "Investimento em " + this.tipoInvestimento + " valor de R$ " + quantidade;
    }

}
