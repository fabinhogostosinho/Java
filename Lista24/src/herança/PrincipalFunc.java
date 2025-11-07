package herança;

public class PrincipalFunc {

		    public static void main(String[] args) {
		        
		        Gerente g1 = new Gerente();
		        g1.setNome("Fábio");
		        g1.setSalarioBase(8000.00);
		        g1.setDepartamento("Tecnologia");
		      
		        Vendedor v1 = new Vendedor();
		        v1.setNome("Henrique");
		        v1.setSalarioBase(2500.00);

		        System.out.println("Dados do gerente");
		        g1.exibirInfo(); 
		        
		        System.out.println("Dados do vendedor");
		        v1.exibirInfo();
		        g1.gerenciar();
		        v1.vender();
		       
		    }
		}
