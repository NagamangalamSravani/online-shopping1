public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Example usage of the online shopping system

        // Create some products
        Electronics laptop = new Electronics("Laptop", 101, 1200.0, 5, "Dell", 12);
        Clothing shirt = new Clothing("Shirt", 201, 30.0, 10, "M", "Cotton");

        // Add products to shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProductToCart(laptop);
        cart.addProductToCart(shirt);

        // Display cart contents and total price
        cart.displayCartContents();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }
}
