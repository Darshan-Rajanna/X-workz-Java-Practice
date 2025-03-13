public class Main {
    public static void main(String[] args) {
        // 5 instances for each class
        Anklet anklet1 = new Anklet("Malabar", "Gold", 1000);
        anklet1.display();
        Anklet anklet2 = new Anklet("Joy alukas", "Silver", 500);
        anklet2.display();
        Anklet anklet3 = new Anklet("Manapuram", "Bronze", 250);
        anklet3.display();
        Anklet anklet4 = new Anklet("Ashwasurya", "Platinum", 1500);
        anklet4.display();
        Anklet anklet5 = new Anklet("Designer", "Copper", 750);
        anklet5.display();

        Bar bar1 = new Bar("Ananda", "Nelamangala", 10);
        bar1.display();
        Bar bar2 = new Bar("Bharath Bar", "Nelamangala", 20);
        bar2.display();
        Bar bar3 = new Bar("Chandana", "Rajajinagar", 30);
        bar3.display();
        Bar bar4 = new Bar("Dhruva", "Koramangala", 40);
        bar4.display();
        Bar bar5 = new Bar("Eshwari", "Jayanagar", 50);
        bar5.display();

        Chain chain1 = new Chain("Gold", "Yellow", 10000);
        chain1.display();
        Chain chain2 = new Chain("Silver", "White", 5000);
        chain2.display();
        Chain chain3 = new Chain("Bronze", "Brown", 2500);
        chain3.display();
        Chain chain4 = new Chain("Platinum", "Grey", 15000);
        chain4.display();
        Chain chain5 = new Chain("Copper", "Red", 7500);
        chain5.display();

        Charger charger1 = new Charger("Nokia", "Xiomi", 1);
        charger1.display();
        Charger charger2 = new Charger("Samsung", "Oneplus", 2);
        charger2.display();
        Charger charger3 = new Charger("Apple", "Mac", 3);
        charger3.display();
        Charger charger4 = new Charger("Lenovo", "Dell", 4);
        charger4.display();
        Charger charger5 = new Charger("HP", "Acer", 5);
        charger5.display();

        Chat chat1 = new Chat("Whattsapp", "Text message", 1);
        chat1.display();
        Chat chat2 = new Chat("Telegram", "Voice message", 2);
        chat2.display();
        Chat chat3 = new Chat("Signal", "Video message", 3);
        chat3.display();
        Chat chat4 = new Chat("Hike", "Image message", 4);
        chat4.display();
        Chat chat5 = new Chat("Wechat", "File message", 5);
        chat5.display();

        Festival festival1 = new Festival("Diwali", "India", 1);
        festival1.display();

        Harpic harpic1 = new Harpic("Lime", "Green", 1);
        harpic1.display();

        Magnet magnet1 = new Magnet("Iron", "Black", 1);
        magnet1.display();

        RatPoison ratpoison1 = new RatPoison("Cipla", "Black", 1);
        ratpoison1.display();

        Whattsapp whattsapp1 = new Whattsapp("Text message", "Text message", 1);
        whattsapp1.display();

    }
}