package primeiroProjeto;

import java.util.Scanner;

public class ListadeExercícios12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1 - Contador:
		System.out.println("--------------------");
		int contador = 10;
		do {
		System.out.println(contador);
		contador++; //+1
		} while (contador <= 30);
		System.out.println("--------------------");
		
		//2 - Adivinhação de número:
		System.out.println("--------------------");
		int  num;
		do {
			System.out.println("Tente advinhar o número (está entre 1 e 10): ");
			num = sc.nextInt();
		}while(num != 5);
		System.out.println("--------------------");
		
		//3 - Verificação de peso na mala:
		System.out.println("--------------------");
		int mala;
		do {
			System.out.println("Digite o peso da mala(kg)");
			mala = sc.nextInt();
			if(mala > 23){
				System.out.println("Peso excedido");
			}else {
				System.out.println("Peso aceito");
			}
		}while(mala > 23);
		System.out.println("--------------------");
		
		//4 - Verificar quantidade de páginas lidas na semana:
		System.out.println("----------------------");
		int pagina = 1;
		int totalpag = 0;
		int pag = 0;

		do {
		    System.out.println("Quantas páginas vc leu hoje?");
		    pag = sc.nextInt();
		    totalpag = totalpag + pag;
		    pagina++;
		} while(pagina <= 7);

		System.out.println("Voce leu " + totalpag + " páginas.");
		System.out.println("----------------------");
		
		//5 - Testar código de acesso:
		System.out.println("----------------------");
		int codigoCorreto = 789;
        int codigoDigitado;

        do {
            System.out.println("Digite o código de acesso de 3 dígitos:");
            codigoDigitado = sc.nextInt();

            if (codigoDigitado != codigoCorreto) {
                System.out.println("Código incorreto! Tente novamente.");
            }
        } while (codigoDigitado != codigoCorreto);

        System.out.println("Código correto! Dispositivo desbloqueado.");
        System.out.println("----------------------");
        
        // 6 - Verificar nível de combustível:
        System.out.println("----------------------");
        int comb;
        do {
            System.out.print("Digite o nível de combustível em litros: ");
            comb = sc.nextInt();

            if (comb <= 10) {
                System.out.println("Combustível baixo!");
            }
        } while (comb <= 10);
        System.out.println("Combustível suficiente para viagem!");
        System.out.println("---------------------");
        
        // 7 - Contar quilômetros percorridos:
        System.out.println("---------------------");
        int distancia;
        int totalKm = 0;
        do {
            System.out.print("Digite a distância percorrida neste trecho: ");
            distancia = sc.nextInt();
            if (distancia > 0) {
                totalKm += distancia;
            }
        } while (distancia > 0);
        System.out.println("Total de quilômetros percorridos: " + totalKm);
        System.out.println("---------------------");

		

	}

}
