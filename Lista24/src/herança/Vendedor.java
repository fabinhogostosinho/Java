package herança;

	public class Vendedor extends Funcionario {
	    private double comissao = 500.0;

	    public void vender() {
	        System.out.println(this.getNome() + " realizou uma venda!");
	    }

	    
	    public double calcularSalario() {
	       
	        return this.getSalarioBase() + this.comissao;
	    }
	    
	    
	}

