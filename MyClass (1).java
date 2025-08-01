public class MyClass {
    public static void main(String args[]) {
    
    // 1
    double inst = 300.00;
    double limp = 150.00;
    double manut = 499.99;
    double soma = inst + limp + manut;
    System.out.println("O cliente deve pagar: " + soma);
    // 2
    String nome = "Joaquim";
    double salariophr = 35.00;
    int hrtraba = 8;
    double mult = salariophr * hrtraba;
    System.out.println("Seu salário no fim do dia vai ser de: " + mult);

    // 3
    int cx = 27;
    int qnt = 16;
    int multBombons = cx * qnt;
    System.out.println("Você tem " + multBombons + " bombons");

    // 4
    int vendeu = 300;
    int cdcxs = 20;
    int div = vendeu / cdcxs;
    System.out.println("A loja vendeu " + div + " garrafas de água");

    // 5
    int comp = 120;
    int vendeuAgua = 80;
    double price = 30.00;
    int compp = 50;
    int tmagr = comp + compp - vendeuAgua;
    double lucro = vendeuAgua * price;
    System.out.println("A loja tem " + tmagr + " no estoque.");
    System.out.println("O faturamento foi de " + lucro);

    // 6
    double variavel = 10;
    int dobro = (int) (variavel * 2);
    int metade = (int) (variavel / 2);
    System.out.println ("O número é 10");
    System.out.println("O dobro é: " + dobro + " e a metade é: " + metade);
    }
}