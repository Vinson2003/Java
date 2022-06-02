
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        // TODO code application logic here
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.
        double price = 13;
        double tax = 0.1;
        int qty = 2;

        // Declare and assign a calculated totalPrice
        double totalPrice = price * (1*tax) * qty;

        // Modify message to include quantity
        message = custName+" wants to purchase "+qty+" "+itemDesc;
        System.out.println(message);

        // Print another message with the total cost
        System.out.println("Total cost with tax is: $" + totalPrice);
        
    }    
}
