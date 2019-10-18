package Lec17;

public class PClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FoodMenu();
	}

	public static void FoodMenu() {

		System.out.println("Welcome to BurgerKing");

		try {

		} catch (Exception e) {

//			System.out.println("Error Occurred");
			// opens food menu
		}

		try {
			addToCart();
		} catch (Exception e) {
			return;
		}

		System.out.println("you can order food again");
	}

	public static void addToCart() {

		System.out.println("Fiery chicken added");

		// Discount coupons
	}

	public static void PaymentGateway() throws Exception {

		System.out.println("Connecting to Paytm");

		throw new Exception("Payment Failed");

		// Delivery boy assingned
	}

}
