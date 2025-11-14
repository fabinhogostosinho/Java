package Lista21;

public class Lista21 {

	public static void main(String[] args) {

		System.out.println(somar(5, 8)); 
		linha();
        System.out.println(subtrair(16, 8));
        linha();
        System.out.println(multi(3, 7)); 
        linha();
        System.out.println(dividir(5, 2)); 
        linha();
        System.out.println(media(8, 6)); 
        linha();
        System.out.println(aprovacao(6, 8)); 
        linha();
        System.out.println(numero(9, 9)); 
        linha();
        System.out.println(celsius(25)); 
        linha();
        System.out.println(retangulo(5, 3)); 
        linha();
        System.out.println(mensagem("Fábio")); 
        linha();
        System.out.println(nomes("Fábio", "Souza")); 
        linha();
        System.out.println(idade(22)); 
	}
	
	public static void linha() {
		System.out.println("--------------------");
	}
	
	// 1
    public static int somar(int a, int b) {
        return a + b;
    }

    // 2
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // 3
    public static int multi(int a, int b) {
        return a * b;
    }

    // 4 
    public static String dividir(double a, double b) {
        if (b == 0) {
            return "Não é possível dividir por 0";
        }
        return "Resultado: " + (a / b);
    }

    // 5 
    public static double media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // 6 
    public static String aprovacao(double nota1, double nota2) {
        double media = media(nota1, nota2);
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // 7 
    public static String numero(int a, int b) {
        if (a > b) {
            return "O maior número é: " + a;
        } else if (b > a) {
            return "O maior número é: " + b;
        } else {
            return "Eles são iguais";
        }
    }

    // 8 
    public static double celsius(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 9 
    public static double retangulo(double base, double altura) {
        return base * altura;
    }

    // 10 
    public static String mensagem(String nome) {
        return "Olá, " + nome + "!";
    }

    // 11 
    public static String nomes(String nome1, String nome2) {
        return nome1 + " " + nome2;
    }

    // 12 
    public static String idade(int idade) {
        if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
	
	
	
    }

}
