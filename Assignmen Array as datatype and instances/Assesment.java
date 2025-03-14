public class Assesment{
    public static void main(String[] args) {
        // Class 1
        class Person {
            int age = 22;
            float height = 5.5f;
            char grade = 'A';
            boolean isStudent = true;
            String name = "Darshan R";

            void reinitialize() {
                age = 23;
                height = 5.6f;
                grade = 'B';
                isStudent = false;
                name = "Darshan Rajanna";
            }

            void print() {
                System.out.println("Person:");
                System.out.println("Age: " + age);
                System.out.println("Height: " + height);
                System.out.println("Grade: " + grade);
                System.out.println("Is Student: " + isStudent);
                System.out.println("Name: " + name);
                System.out.println();
            }
        }

        // Class 2
        class Family {
            String father = "Rajanna R E";
            String mother = "Manjamma";
            String sibling = "Jayanth R";
            String city = "Tumkur";
            String country = "India";

            void reinitialize() {
                father = "Rajanna";
                mother = "Manju";
                sibling = "Jay";
                city = "Bangalore";
                country = "India";
            }

            void print() {
                System.out.println("Family:");
                System.out.println("Father: " + father);
                System.out.println("Mother: " + mother);
                System.out.println("Sibling: " + sibling);
                System.out.println("City: " + city);
                System.out.println("Country: " + country);
                System.out.println();
            }
        }

        // Class 3
        class Friend {
            String bestFriend = "Jayanth";
            int yearsKnown = 20;
            boolean isClose = true;
            String commonInterest = "Sports";
            String support = "Always";

            void reinitialize() {
                bestFriend = "Jay";
                yearsKnown = 21;
                isClose = false;
                commonInterest = "Music";
                support = "Sometimes";
            }

            void print() {
                System.out.println("Friend:");
                System.out.println("Best Friend: " + bestFriend);
                System.out.println("Years Known: " + yearsKnown);
                System.out.println("Is Close: " + isClose);
                System.out.println("Common Interest: " + commonInterest);
                System.out.println("Support: " + support);
                System.out.println();
            }
        }

        // Class 4
        class Job {
            String dreamJob = "Modern Farmer";
            boolean usesTechnology = true;
            boolean sustainablePractices = true;
            String goal = "Improve productivity";
            String environment = "Healthy";

            void reinitialize() {
                dreamJob = "Software Engineer";
                usesTechnology = true;
                sustainablePractices = false;
                goal = "Develop software";
                environment = "Corporate";
            }

            void print() {
                System.out.println("Job:");
                System.out.println("Dream Job: " + dreamJob);
                System.out.println("Uses Technology: " + usesTechnology);
                System.out.println("Sustainable Practices: " + sustainablePractices);
                System.out.println("Goal: " + goal);
                System.out.println("Environment: " + environment);
                System.out.println();
            }
        }

        // Class 5
        class Vehicle {
            String type = "Car";
            String brand = "Toyota";
            int year = 2020;
            String color = "Red";
            boolean isElectric = false;

            void reinitialize() {
                type = "Bike";
                brand = "Honda";
                year = 2021;
                color = "Blue";
                isElectric = true;
            }

            void print() {
                System.out.println("Vehicle:");
                System.out.println("Type: " + type);
                System.out.println("Brand: " + brand);
                System.out.println("Year: " + year);
                System.out.println("Color: " + color);
                System.out.println("Is Electric: " + isElectric);
                System.out.println();
            }
        }

        // Class 6
        class Book {
            String title = "Java Programming";
            String author = "John Doe";
            int pages = 500;
            boolean isHardcover = true;
            String publisher = "Tech Books";

            void reinitialize() {
                title = "Advanced Java";
                author = "Jane Doe";
                pages = 600;
                isHardcover = false;
                publisher = "Code Books";
            }

            void print() {
                System.out.println("Book:");
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Pages: " + pages);
                System.out.println("Is Hardcover: " + isHardcover);
                System.out.println("Publisher: " + publisher);
                System.out.println();
            }
        }

        // Class 7
        class Computer {
            String brand = "Dell";
            String processor = "Intel i7";
            int ram = 16;
            int storage = 512;
            boolean isLaptop = true;

            void reinitialize() {
                brand = "HP";
                processor = "AMD Ryzen 7";
                ram = 32;
                storage = 1024;
                isLaptop = false;
            }

            void print() {
                System.out.println("Computer:");
                System.out.println("Brand: " + brand);
                System.out.println("Processor: " + processor);
                System.out.println("RAM: " + ram);
                System.out.println("Storage: " + storage);
                System.out.println("Is Laptop: " + isLaptop);
                System.out.println();
            }
        }

        // Class 8
        class Smartphone {
            String brand = "Samsung";
            String model = "Galaxy S21";
            int storage = 128;
            int batteryLife = 24;
            boolean is5G = true;

            void reinitialize() {
                brand = "Apple";
                model = "iPhone 13";
                storage = 256;
                batteryLife = 20;
                is5G = false;
            }

            void print() {
                System.out.println("Smartphone:");
                System.out.println("Brand: " + brand);
                System.out.println("Model: " + model);
                System.out.println("Storage: " + storage);
                System.out.println("Battery Life: " + batteryLife);
                System.out.println("Is 5G: " + is5G);
                System.out.println();
            }
        }

        // Initialize and reinitialize objects
        Person person = new Person();
        Family family = new Family();
        Friend friend = new Friend();
        Job job = new Job();
        Vehicle vehicle = new Vehicle();
        Book book = new Book();
        Computer computer = new Computer();
        Smartphone smartphone = new Smartphone();

        // Print initial values
        System.out.println("Initial Values:");
        person.print();
        family.print();
        friend.print();
        job.print();
        vehicle.print();
        book.print();
        computer.print();
        smartphone.print();

        // Reinitialize objects
        person.reinitialize();
        family.reinitialize();
        friend.reinitialize();
        job.reinitialize();
        vehicle.reinitialize();
        book.reinitialize();
        computer.reinitialize();
        smartphone.reinitialize();

        // Print reinitialized values
        System.out.println("Reinitialized Values:");
        person.print();
        family.print();
        friend.print();
        job.print();
        vehicle.print();
        book.print();
        computer.print();
        smartphone.print();
    }
}