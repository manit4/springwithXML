import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Restaurant {
	
	Tea tea;
	
	public void setTea(Tea tea) {
		this.tea = tea;
	}

	void takingOrder() {

		System.out.println("Order is done..");
		tea.prepareTea();
	}
	
	
	public Restaurant() {
		System.out.println("inside Restaurant constr...");
	}
}

public class MainWithSpring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean");
		
		//Restaurant restaurant = context.getBean("restaurant", Restaurant.class);

		restaurant1.takingOrder();
	}

}


//class Restaurant {//Another scope of bean is prototype which means you will get the new/fresh object every time you ask for it...
//				//and to make your bean as prototype, then you have to have entry in the bean definition in spring-config file...
//	String restaurantName;
//
//	public void setRestaurantName(String restaurantName) {
//		this.restaurantName = restaurantName;
//	}
//
//	void prepareTea() {
//
//		System.out.println("tea is being prepared...");
//	}
//}
//
//public class MainWithSpring {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//
//		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean1");
//
//		System.out.println(restaurant1.restaurantName);
//
//		restaurant1.restaurantName = "ABC Chains";
//
//		Restaurant restaurant2 = (Restaurant) context.getBean("restaurantBean1");
//
//		System.out.println(restaurant2.restaurantName);
//	}
//
//}



//class Restaurant {//This is another pet question- what is the by default scope of a bean
//				//and the answer is "singleton", it means ApplicationContext creates just 1 copy of Object/bean defined in the 
//				//spring-config file and will give you same object every time you ask for it
//				//Below is the program of singleton...
//
//	String restaurantName;
//
//	public void setRestaurantName(String restaurantName) {
//		this.restaurantName = restaurantName;
//	}
//
//	void prepareTea() {
//
//		System.out.println("tea is being prepared...");
//	}
//}
//
//public class MainWithSpring {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//
//		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean1");
//
//		System.out.println(restaurant1.restaurantName);
//		
//		restaurant1.restaurantName = "ABC Chains";
//		
//		Restaurant restaurant2 = (Restaurant) context.getBean("restaurantBean1");
//		
//		System.out.println(restaurant2.restaurantName);
//	}
//
//}

//class Restaurant {//This is another or last way to inject dependency which is through constructor...
//
//	String restaurantName;
//	
//	public Restaurant(String restaurantName) {
//		super();
//		this.restaurantName = restaurantName;
//	}
//
//
//	void prepareTea() {
//
//		System.out.println("tea is being prepared...");
//	}
//}
//
//public class MainWithSpring {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside main....");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean1");
//
//		restaurant.prepareTea();
//
//		System.out.println("Restaurant name is "+restaurant.restaurantName);
//	}
//
//}

//class Restaurant {
//
//	String restaurantName;
//	int phone;
//
//	public void setRestaurantName(String restaurantName) {
//		this.restaurantName = restaurantName;
//	}
//	
//	public void setPhone(int phone) {
//		this.phone = phone;
//	}
//
//	void prepareTea() {
//
//		System.out.println("tea is being prepared...");
//	}
//}
//
//public class MainWithSpring {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside main....");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean1");
//
//		restaurant.prepareTea();
//
//		System.out.println("Restaurant name is "+restaurant.restaurantName);
//		
//		System.out.println("Phone is "+restaurant.phone);
//	}
//
//}

//class Restaurant {//This is the pet question in an interviews---- by how many ways you can inject objects and values
//					//The answer is 2 ways, one way is to use setter() and the second way is through constructor....
//	
//					//This is the program for injecting value or object through setter()...
//	
//	String restaurantName;
//	
//	public String getRestaurantName() {
//		return restaurantName;
//	}
//
//
//	public void setRestaurantName(String restaurantName) {
//		this.restaurantName = restaurantName;
//	}
//
//	void prepareTea() {
//		
//		System.out.println("tea is being prepared...");
//	}
//}
//
//
//public class MainWithSpring {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("inside main....");
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean1");
//		
//		restaurant.prepareTea();
//		
//		System.out.println(restaurant.restaurantName);
//	}
//
//}

//class Restaurant {
//	
//	Restaurant() {
//		System.out.println("inside Restaurant constructor...");
//	}
//	
//	void prepareTea() {
//		
//		System.out.println("tea is being prepared...");
//	}
//}
//
//class Human {
//	
//	public Human() {
//		System.out.println("inside Human constr");
//	}
//}
//
//
//public class MainWithSpring {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("inside main....");
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean1");
//		
//		restaurant.prepareTea();
//	}
//
//}
