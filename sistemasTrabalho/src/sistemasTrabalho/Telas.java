package sistemasTrabalho;

import java.util.Scanner;

public class Telas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

        do {
            System.out.println("\n===== ECORADAR =====");
            System.out.println("1 - Início");
            System.out.println("2 - Pontos de Coleta");
            System.out.println("3 - Sobre Nós");
            System.out.println("4 - Entrar");
            System.out.println("5 - Criar Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
            case 1:
                System.out.println("\n--- INÍCIO ---");
                System.out.println("Bem-vindo ao EcoRadar! Aqui você encontra informações sobre coleta seletiva e reciclagem.");
                voltar(sc);
                break;
                
            case 2:
                System.out.println("\n--- PONTOS DE COLETA ---");
                System.out.println("Lista de pontos de coleta próximos a você:");
                System.out.println("1 - Suzano");
                System.out.println("2 - Suzano");
                System.out.println("3 - Suzano");
                voltar(sc);
                break;
                
            case 3:
                System.out.println("\n--- SOBRE NÓS ---");
                System.out.println("O EcoRadar é um sistema que conecta cidadãos e pontos de coleta para promover a reciclagem e sustentabilidade.");
                voltar(sc);
                break;
                    
                case 4:
                	String usuarioCorreto = "admin";
                    String senhaCorreta = "1234";

                    System.out.println("===== LOGIN ECORADAR =====");
                    System.out.print("Usuário: ");
                    String usuario = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                        System.out.println("\nBem-vindo ao EcoRadar, " + usuario + "! 🌿");
                        System.out.println("Login realizado com sucesso!");
                    } else {
                        System.out.println("\nUsuário ou senha incorretos!");
                    }
                    break;
                    
                case 5:
                	System.out.println("===== REGISTRO ECORADAR =====");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Usuário: ");
                    String usuario1 = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha1 = sc.nextLine();

                    System.out.print("Confirme a senha: ");
                    String confirmaSenha = sc.nextLine();

                    if (!senha1.equals(confirmaSenha)) {
                        System.out.println("\nAs senhas não coincidem! Tente novamente.");
                    } else {
                        System.out.println("\nRegistro realizado com sucesso, " + nome + "!");
                        System.out.println("Usuário criado: " + usuario1);
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo do EcoRadar... até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while(opcao != 0);

    }
	public static void voltar(Scanner sc) {
	    System.out.println("\nDigite 0 para voltar ao menu principal...");
	    int voltar;
	    do {
	        voltar = sc.nextInt();
	    } while (voltar != 0);
	}
}


