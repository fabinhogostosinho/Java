package primeiroProjeto;

import java.util.Scanner;

public class Lista07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 - Classificação de Filme
        System.out.println("Informe a idade do espectador:");
        int idadeFilme = scanner.nextInt();
        if (idadeFilme < 16 || idadeFilme > 70) {
            System.out.println("Classificação especial");
        } else {
            System.out.println("Classificação regular");
        }
        System.out.println("------------------------------------");

        // 2 - Promoção de Produto
        System.out.println("\nInforme o valor do produto:");
        double valorProduto = scanner.nextDouble();
        System.out.println("Informe a quantidade comprada:");
        int qtdProduto = scanner.nextInt();
        double totalCompra = valorProduto * qtdProduto;
        if (totalCompra > 200 && qtdProduto > 5) {
            totalCompra = 0.85;
            System.out.printf("Total com desconto: R$ %.2f", totalCompra);
        } else {
            System.out.printf("Total sem desconto: R$ %.2f", totalCompra);
        }
        System.out.println("------------------------------------");

        // 3 - Alerta de Saúde
        System.out.println("\nInforme a frequência cardíaca (bpm):");
        int freqCard = scanner.nextInt();
        System.out.println("Sente tontura? (sim/nao)");
        String tontura = scanner.next();
        if (freqCard >= 100 || tontura.equalsIgnoreCase("sim")) {
            System.out.println("Procure atendimento médico");
        } else {
            System.out.println("Sem sinais de alerta");
        }
        System.out.println("/n------------------------------------");

        // 4 - Participação em Concurso
        System.out.println("\nInforme a idade do candidato:");
        int idadeConc = scanner.nextInt();
        System.out.println("É residente do estado? (sim/nao)");
        String residente = scanner.next();
        if (idadeConc >= 18 && idadeConc <= 30 && residente.equalsIgnoreCase("sim")) {
            System.out.println("Elegível para o concurso");
        } else {
            System.out.println("Não elegível para o concurso");
        }
        System.out.println("------------------------------------");

        // 5 - Recompensa por Desempenho
        System.out.println("\nNúmero de projetos concluídos:");
        int projetos = scanner.nextInt();
        System.out.println("Número de erros reportados:");
        int erros = scanner.nextInt();
        if (projetos > 10 && erros < 3) {
            System.out.println("Recompensa concedida");
        } else {
            System.out.println("Sem recompensa");
        }
        System.out.println("------------------------------------");

        // 6 - Autorização para Viagem
        System.out.println("\nInforme a idade:");
        int idadeViagem = scanner.nextInt();
        System.out.println("Possui passaporte válido? (sim/nao)");
        String passaporte = scanner.next();
        if (idadeViagem >= 18 && passaporte.equalsIgnoreCase("sim")) {
            System.out.println("Viagem autorizada");
        } else {
            System.out.println("Viagem não autorizada");
        }
        System.out.println("------------------------------------");

        // 7 - Aprovação em Curso Online
        System.out.println("\nInforme a nota final (0 a 100):");
        int nota = scanner.nextInt();
        System.out.println("Informe o número de aulas assistidas (0 a 50):");
        int aulas = scanner.nextInt();
        if (nota >= 70 && aulas >= 40) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println("------------------------------------");

        // 8 - Controle de Irrigação
        System.out.println("\nInforme a umidade do solo (%):");
        int umidade = scanner.nextInt();
        System.out.println("Informe a temperatura (°C):");
        int temp = scanner.nextInt();
        if (umidade < 30 || temp > 30) {
            System.out.println("Irrigação necessária");
        } else {
            System.out.println("Irrigação não necessária");
        }
        System.out.println("------------------------------------");

        // 9 - Inscrição em Feira Profissional
        System.out.println("\nInforme a idade:");
        int idadeFeira = scanner.nextInt();
        System.out.println("Possui experiência prévia? (sim/nao)");
        String experiencia = scanner.next();
        if (idadeFeira >= 20 && idadeFeira <= 40 && experiencia.equalsIgnoreCase("sim")) {
            System.out.println("Inscrição aceita");
        } else {
            System.out.println("Inscrição não permitida");
        }
        System.out.println("------------------------------------");

    }
}
