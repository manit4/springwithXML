
class Restaurant1 {
	
	String name;
	
	void prepareTea() {
		
		System.out.println("tea is being prepared...");
	}
	
	public Restaurant1(String name) {
		this.name = name;
	}
}


public class MainWithoutSpring {
	
	public static void main(String[] args) {
		
		Restaurant1 restaurant = new Restaurant1("ABC Restaurant Chains");
		
		restaurant.prepareTea();
		
		System.out.println(restaurant.name);
	}

}
