public class ArraysAssesment{

    public static void main(String[] args) {
        // Program to store 10 references of hotel names and print on console
        String[] hotelNames = {"Hotel1", "Hotel2", "Hotel3", "Hotel4", "Hotel5", "Hotel6", "Hotel7", "Hotel8", "Hotel9", "Hotel10"};
        System.out.println("Hotel Names:");
        for (String hotel : hotelNames) {
            System.out.println(hotel);
        }

        // Program to store 10 references of pin-code and print on console
        int[] pinCodes = {123456, 234567, 345678, 456789, 567890, 678901, 789012, 890123, 901234, 123890};
        System.out.println("\nPin Codes:");
        for (int pinCode : pinCodes) {
            System.out.println(pinCode);
        }

        // Program to store 10 references of laptop brands and print on console
        String[] laptopBrands = {"Dell", "HP", "Lenovo", "Apple", "Asus", "Acer", "Microsoft", "Samsung", "Sony", "Toshiba"};
        System.out.println("\nLaptop Brands:");
        for (String brand : laptopBrands) {
            System.out.println(brand);
        }

        // Program to store 10 references of char's and print on console
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.println("\nCharacters:");
        for (char ch : chars) {
            System.out.println(ch);
        }

        // Program to store 10 references of temple names and print on console
        String[] templeNames = {"Temple1", "Temple2", "Temple3", "Temple4", "Temple5", "Temple6", "Temple7", "Temple8", "Temple9", "Temple10"};
        System.out.println("\nTemple Names:");
        for (String temple : templeNames) {
            System.out.println(temple);
        }

        // Program to store 50 references of your choice and print on console
        String[] references = new String[50];
        for (int i = 0; i < references.length; i++) {
            references[i] = "Reference" + (i + 1);
        }
        System.out.println("\nReferences:");
        for (String reference : references) {
            System.out.println(reference);
        }
    }
}