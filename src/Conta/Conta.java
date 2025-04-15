package Conta;

import java.util.Scanner;

public class Conta {

    private int contaBanco;
    private String nomeCliente;
    private String resposta;
    private double totalConta;
    private double deposito;
    private double saque;


    Scanner sc = new Scanner(System.in);

    public Conta() {
        this.contaBanco = contaBanco;
        this.nomeCliente = nomeCliente;
    }

    public int getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(int contaBanco) {
        this.contaBanco = contaBanco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {

        if (resposta.equals("y")) {
            System.out.println("Informe o valor do deposito: ");
            double valor;
            valor = sc.nextDouble();

            setTotalConta(valor);

            System.out.println("Dados da conta: ");
            System.out.println("Conta: "
                    + getContaBanco()
                    + ",  Priprietário: " + getNomeCliente()
                    + ", Saldo: " + getTotalConta());
            System.out.println("Gostaria de fazer mais alguma opração de saque ou deposito? (y/n)");
            resposta = sc.nextLine();
            sc.nextLine();

                if (resposta == "y") {
                    System.out.println("Informe o valor: ");
                    sc.nextLine();

                }else {
                    System.out.println("Informe o valor: ");
                    sc.nextLine();
                }
        } else {
            System.out.println("Dados da conta: ");
            System.out.println("Conta: "
                    + getContaBanco()
                    + ",  Priprietário: " + getNomeCliente()
                    + ", Saldo: " + getTotalConta());
            System.out.println("Gostaria de fazer alguma opração de saque ou deposito? (y/n)");
            resposta = sc.nextLine();
            sc.nextLine();
                if (resposta.equals("y")) {
                    System.out.println("1 - Saque");
                    System.out.println("2 - Deposito");
                    sc.nextLine();
                }
        }
    }
    public double getTotalConta() {
        return totalConta;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }
    public void depositar() {

    }
    public void sacar() {
        if (totalConta <= 0.00 || saque <= totalConta) {
            System.out.println("Valor insuficiente");
        }
    }
}
