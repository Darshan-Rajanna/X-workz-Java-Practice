public class Holi {
    String festivalName, country, tradition, mainColor;
    int duration;
    double budget;

    public Holi() {
        this("Holi", "India", "Color Throwing", "Multicolor", 2, 500.0);
        System.out.println("Holi: Default constructor called");
    }

    public Holi(String festivalName) {
        this();
        System.out.println("Holi: FestivalName constructor called");
        this.festivalName = festivalName;
    }

    public Holi(String festivalName, String country) {
        this(festivalName);
        System.out.println("Holi: FestivalName & Country constructor called");
        this.country = country;
    }

    public Holi(String festivalName, String country, String tradition) {
        this(festivalName, country);
        System.out.println("Holi: FestivalName, Country & Tradition constructor called");
        this.tradition = tradition;
    }

    public Holi(String festivalName, String country, String tradition, String mainColor) {
        this(festivalName, country, tradition);
        System.out.println("Holi: FestivalName, Country, Tradition & MainColor constructor called");
        this.mainColor = mainColor;
    }

    public Holi(String festivalName, String country, String tradition, String mainColor, int duration) {
        this(festivalName, country, tradition, mainColor);
        System.out.println("Holi: FestivalName, Country, Tradition, MainColor & Duration constructor called");
        this.duration = duration;
    }

    public Holi(String festivalName, String country, String tradition, String mainColor, int duration, double budget) {
        System.out.println("Holi: All properties initialized constructor called");
        this.festivalName = festivalName;
        this.country = country;
        this.tradition = tradition;
        this.mainColor = mainColor;
        this.duration = duration;
        this.budget = budget;
    }

    public void display() {
        System.out.println("Holi Details: Festival = " + festivalName + ", Country = " + country +
            ", Tradition = " + tradition + ", MainColor = " + mainColor + ", Duration = " + duration + " days, Budget = $" + budget);
    }
}
