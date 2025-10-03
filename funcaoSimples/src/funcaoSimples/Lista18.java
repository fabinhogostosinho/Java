package funcaoSimples;

public class Lista18 {

	public static void main(String[] args) {
		apresentacao();
		apresentacao();
		apresentacao();
		apresentacao();
		apresentacao();
		apresentacao();
		separador();
		frase();
		separador();
		valores();
		mostrarVogais();
		imprimirPares();
		contagemRegressiva();
		desenharQuadrado();
		desenharTriangulo();
		diasDaSemana();
		
		
	}
	
	public static void apresentacao () {
		System.out.println("Fábio Henrique");
	}
	
	
	public static void separador () {
		System.out.println("-------------------------");
	}
	
	public static void frase () {
		System.out.println("Não deixe para amanhã o que vc pode fazer hj");
	}
	public static void valores () {
			for (int i = 1; i<=10; i++) {
				System.out.println(i);
			}
		}
	public static void mostrarVogais() {
        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
        for (char v : vogais) {
            System.out.println(v);
        }
        }
        public static void imprimirPares() {
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.println(i);
	        }
	        }
	        public static void contagemRegressiva() {
		        for (int i = 10; i >= 1; i--) {
		            System.out.println(i);
		        }
		        System.out.println("Fim!");
		    }
	        public static void desenharQuadrado() {
		        int tamanho = 5;
		        for (int i = 0; i < tamanho; i++) {
		            for (int j = 0; j < tamanho; j++) {
		                System.out.print("* ");
		            }
		        }
		            }
		            public static void desenharTriangulo() {
		    	        for (int i = 1; i <= 5; i++) {
		    	            for (int j = 1; j <= i; j++) {
		    	                System.out.print("* ");
		    	            }
		    	        }
		    	            }
		      public static void diasDaSemana() {
		    	  String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
		    	    	        for (String dia : dias) {
		    	    	            System.out.println(dia);
		    	    	        }
		    	    	    }


		           
		       
}

		

