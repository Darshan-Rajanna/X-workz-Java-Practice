
class Mango {
    void check(FruitBasket fruitBasket) {
        if (fruitBasket != null) {
            fruitBasket.taste();
        } else {
            System.out.println("Mango object is null, cannot check taste");
        }
    }
    static class FruitBasket {
        void taste() {
            System.out.println("Mango is sweet and delicious");
        }
    }
    
}