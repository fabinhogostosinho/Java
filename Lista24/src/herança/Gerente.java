package herança;

public class Gerente extends Funcionario {
    
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
  
    public void gerenciar() {
        System.out.println(this.getNome() + " está gerenciando o departamento de " + departamento );
    }

   
    public double calcularSalario() {
        double salarioBase = this.getSalarioBase(); 
        
        return salarioBase * 1.20; 
    }
}