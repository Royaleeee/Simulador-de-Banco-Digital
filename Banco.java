
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo, iniciar, opcao, saque, deposito, transferir, senha;
        String cpf, recebe, nome;
        

        System.out.print("Digite seu cpf:");
        cpf = scan.nextLine();

        System.out.print("Digite sua senha: ");
        senha = scan.nextInt();

        System.out.print("Como posso te chamar: ");
        scan.nextLine();
        nome = scan.nextLine();
        

        saldo = 100;

        System.out.println("Olá " + nome + ", seja bem vindo ao Banco Roys!");
        System.out.println("Você recebeu um bônus de R$" + saldo + " por iniciar sua conta conosco.");

            while (true) {
            
            System.out.println("Digite 1 Para acessar sua conta: ");
            iniciar = scan.nextInt();

            if (iniciar == 1) {
                System.out.println("Seu saldo atual é de R$" + saldo);
                break;

            } else {
                System.out.println("Opção inválida");
            }

            }

        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sair");

        System.out.print("Digite a opção desejada: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("Quanto você deseja sacar? ");
            saque = scan.nextInt();

            System.out.print("Digite sua senha para concluir: ");
            senha = scan.nextInt();

            if (saque > saldo) {
                System.out.println("Saldo insuficiente para saque.");
            } else {
                saldo -= saque;
                System.out.println("Saque realizado com sucesso. Seu saldo atual é de R$" + saldo);
            }

                break;

            case 2:
            System.out.println("Quanto você deseja depositar? ");
            deposito = scan.nextInt();

            saldo += deposito;

            System.out.print("Digite sua senha para concluir: ");
            senha = scan.nextInt();

            System.out.println("Depósito realizado com sucesso. Seu saldo atual é de R$" + saldo);
                
                break;

            case 3:
            System.out.println("Seu saldo atual é de R$" + saldo);
                
                break;

            case 4:
            System.out.println("Para quem/Para qual conta deseja transferir? ");
            scan.nextLine();
            recebe = scan.nextLine();

            System.out.println("Quanto você deseja transferir? ");
            transferir = scan.nextInt();

            System.out.print("Digite sua senha para concluir: ");
            senha = scan.nextInt();

            if (transferir > saldo) {
                System.out.println("Saldo insuficiente para transferência.");
            } else {
                saldo -= transferir;
                System.out.println("Transferência realizada com sucesso. Seu saldo atual é de R$" + saldo);
            }
            
                break;

            case 5:
            System.out.println("Saindo...");
                
                break;
        
            default:
                break;
        }

        
        
        

            
        






        scan.close();
    }

    
    
}
