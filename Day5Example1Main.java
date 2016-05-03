
public class Day5Example1Main {

	public static void main(String[] args) {
		double[] prices = {100.0, 50.0, 200.0, 500.0};
		double price = 1000.0;
		
		double discount = getDiscount(price, 10.0);
		priceIncrease(prices, 50);
		
		System.out.println("Price = " + price);
		for (int i=0; i<prices.length; i++){
			System.out.println("Prices ["+i+"] is " + prices[i]);
			
		}

	}
	//this method uses pass by value
	public static double  getDiscount(double price, double discountPercentage){
		price = price - ((price * discountPercentage) / 100.0);
		return price;
		
	}
	// this method uses pass by reference
	public static void priceIncrease(double[] prices, double percentage){
		
		for (int i = 0; i<prices.length; i++){
			prices[i] = prices[i] + ((prices[i] * percentage)/ 100.0);
			
		}
	}
}
