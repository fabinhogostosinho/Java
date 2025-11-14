package Lista25;

public class RestaurantePrincipal {

	public static void main(String[] args) {
		Prato p1 = new Pizza();
        Prato p2 = new Lasanha();
        Prato p3 = new Salada();

        System.out.println("Pizza - R$ " + p1.calcularPreco());
        System.out.println("Lasanha - R$ " + p2.calcularPreco());
        System.out.println("Salada - R$ " + p3.calcularPreco());
    }
}
