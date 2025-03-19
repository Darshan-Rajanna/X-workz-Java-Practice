
class Mango {
    void check(FruitBasket fruitBasket) {
        if (fruitBasket != null) {
            fruitBasket.taste();
            System.out.println("FruitBasket is not null");
        } else {
            System.out.println("FruitBasket object is null, cannot check taste");
        }
    }
    static class FruitBasket {
        void taste() {
            System.out.println("Mango is sweet and delicious");
        }
    }
    
}