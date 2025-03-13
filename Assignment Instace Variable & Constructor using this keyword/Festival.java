class Festival{

    String name;
    String location;
    int noOfDays;

    public Festival(String name, String location, int noOfDays) {
        this.name = name;
        this.location = location;
        this.noOfDays = noOfDays;

    }
    public void display() {
        System.out.println("Festival Name: "+name);
        System.out.println("Location: "+location);
        System.out.println("No of Days: "+noOfDays);
    }
}