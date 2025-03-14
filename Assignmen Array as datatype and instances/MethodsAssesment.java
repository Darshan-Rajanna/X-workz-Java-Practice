import java.util.ArrayList;

public class MethodsAssesment {

    public static void main(String[] args) {
        ArrayList<String> temples = new ArrayList<>();
        
        // Adding temple names to the list
        addTemple(temples, "Tirupati Balaji");
        addTemple(temples, "Vaishno Devi");
        addTemple(temples, "Shirdi Sai Baba");
        addTemple(temples, "Golden Temple");
        addTemple(temples, "Kashi Vishwanath");
        addTemple(temples, "Somnath Temple");
        addTemple(temples, "Meenakshi Temple");
        addTemple(temples, "Jagannath Temple");
        addTemple(temples, "Ramanathaswamy Temple");
        addTemple(temples, "Siddhivinayak Temple");
        
        // Inserting a temple name at a specific position
        insertTemple(temples, 5, "Mahakaleshwar Temple");
        
        printTemples(temples);
    }

    public static void addTemple(ArrayList<String> temples, String temple) {
        temples.add(temple);
    }

    public static void insertTemple(ArrayList<String> temples, int index, String temple) {
        if (index >= 0 && index <= temples.size()) {
            temples.add(index, temple);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void printTemples(ArrayList<String> temples) {
        for (String temple : temples) {
            System.out.println(temple);
        }
    }
}
