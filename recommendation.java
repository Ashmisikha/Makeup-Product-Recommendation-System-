import java.util.List;

public class Recommendation {
    public static Product recommend(List<Product> products, User user) {
        for (Product product : products) {
            if (product.getCategory().equals("Foundation") && product.getShade().equals(user.getSkinTone())) {
                return product;
            }
        }
        return null; // No match found
    }
}
