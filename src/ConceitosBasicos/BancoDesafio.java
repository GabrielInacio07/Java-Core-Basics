package ConceitosBasicos;

import java.util.Scanner;

public class BancoDesafio {
    private String nome;
    private String cpf;
    private double saldo;

    public BancoDesafio(String nome,String cpf,double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("\n===== DADOS DA CONTA =====");
        System.out.println("Nome do proprietário: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo: " + this.saldo);
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("[ERROR] Valor inválido para depósito.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito realizado! Novo saldo: " + this.saldo);
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("[ERROR] Valor inválido para saque.");
            return;
        }

        if(valor > saldo){
            System.out.println("[ERROR] O valor de SAQUE é maior que o SALDO");
        }else{
            this.saldo -= valor;
            System.out.println("Saque realizado! Novo saldo: " + this.saldo);
        }
    }

    public static void main(String[] args) {

        int opcao = -1;
        Scanner input = new Scanner(System.in);
        BancoDesafio banco = new BancoDesafio("Gabriel", "111.111.111-11",500);

        while (opcao != 4){

            System.out.println("\n========== DESAFIO BANCO ALURA ==========");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Conta");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = input.nextInt();
            double valor;

            switch (opcao){

                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    valor = input.nextDouble();
                    banco.depositar(valor);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    valor = input.nextDouble();
                    banco.sacar(valor);
                    break;

                case 3:
                    banco.exibirConta();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("[ERROR] Opção inválida.");
            }
        }

        input.close();
    }
}
