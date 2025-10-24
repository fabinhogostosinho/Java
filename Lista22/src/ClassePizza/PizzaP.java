package ClassePizza;

public class PizzaP {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
        pizza.sabor = "Calabresa";
        pizza.tamanho = "Grande";
        pizza.bordaRecheada = true;
        pizza.preparar();
        pizza.assando();
        pizza.mostrarInformacoes();

	}

}
