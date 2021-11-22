package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();
    @BeforeEach
    void init(){
        store.addProduct(new Product("Valami",Type.FRUITS,2));
        store.addProduct(new Product("Valami",Type.FRUITS,2));
        store.addProduct(new Product("Valami",Type.FRUITS,2));
        store.addProduct(new Product("Valami",Type.BREAD,2));
        store.addProduct(new Product("Valami",Type.BREAD,2));
        store.addProduct(new Product("Valami",Type.BREAD,2));
        store.addProduct(new Product("Valami",Type.MILK,2));
        store.addProduct(new Product("Valami",Type.MILK,2));
        store.addProduct(new Product("Valami",Type.MILK,2));
    }

    @Test
    void addProduct() {
        Store store1 = new Store();
        assertEquals(0, store1.getProducts().size());
        store1.addProduct(new Product("Valami", Type.FRUITS,2));
        assertEquals(1, store1.getProducts().size());

    }

    @Test
    void counterProductByType() {
        List<ProductAndPieces> result = store.counterProductByType();
        assertEquals(3,result.size());
        assertEquals(3,result.size());
    }

    @Test
    void testAnEmptyStore() {
        Store storeEmpty = new Store();
        List<ProductAndPieces> result = storeEmpty.counterProductByType();
        assertEquals(0,result.size());
    }
}