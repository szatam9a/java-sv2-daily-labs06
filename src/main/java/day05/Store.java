package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<ProductAndPieces> counterProductByType() {

        List<ProductAndPieces> result = new ArrayList<>();
        for (Product actual : products
        ) {
            ProductAndPieces pap = containsIt(actual, result);
            if (pap != null) {
                pap.gotAPiece();
            } else {
                result.add(new ProductAndPieces(actual.getType()));
            }
        }
        return result;
    }



    public ProductAndPieces containsIt(Product actual, List<ProductAndPieces> list) {
        for (ProductAndPieces pap : list
        ) {
            if (pap.getType() == actual.getType()) {
                return pap;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
