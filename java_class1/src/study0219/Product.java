package study0219;

public class Product {
	String name;
	String brand;
	int amount;
	
	Product(){}
	Product(String name, int amount){
		this.name = name;
		this.amount = amount;
	}
	Product(String name, String brand, int amount){
		this.name = name;
		this.brand = brand;
		this.amount = amount;
	}
}
