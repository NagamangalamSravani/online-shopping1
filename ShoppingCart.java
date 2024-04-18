import java.util.ArrayList;

// ShoppingCart.java
public class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
        cartItems.add(product);
        System.out.println("Product added to cart: " + product.getProductName());
    }

    public void displayCartContents() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Shopping Cart Contents:");
            for (Product product : cartItems) {
                product.displayDetails();
                System.out.println("---------------------------");
            }
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : cartItems) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
