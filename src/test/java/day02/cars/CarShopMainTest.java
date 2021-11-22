package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopMainTest {

    Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 100);
    Car car3 = new Car("Lamborghini", 5.2, Color.BLACK, 10_000_001);

    CarShop carShop = new CarShop("Best Car", 10_000_000);
    @Test
    void testCarInit(){
        assertEquals("Toyota", car1.getBrand() );
        assertEquals(1.2, car1.getEngineSize() );
        assertEquals(Color.BLACK , car1.getColor() );
        assertEquals(2300000 , car1.getPrice());
    }
    @Test
    void testCarAddToTheShopTrue(){
        assertTrue(carShop.addCar(car1));
    }
    @Test
    void testCarAddToTheShopFalse(){
        assertFalse(carShop.addCar(car3));
    }
    @Test
    void testCarPriceModification(){
        car2.decreasePrice(10);
        assertEquals(90, car2.getPrice());
    }
    @Test
    void testCarsPriceSum(){
        carShop.addCar(car1);
        carShop.addCar(car2);
        assertEquals(2_300_100,carShop.sumCarPrice());
    }
    @Test
    void testCarsCheaperMethod(){
        assertEquals(0, carShop.numberOfCarsCheaperThan(2_000_000));
        carShop.addCar(car2);
        assertEquals(1,carShop.numberOfCarsCheaperThan(2_000_000));
    }
}