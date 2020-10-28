package animalkingdom;

public abstract class Animals {
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public Animals(String name, int yearDiscovered) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return yearDiscovered;
    }

    public void setYear(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String getMovement();

    public abstract String getBreath();

    public abstract String getReproduce();

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Year Discovered: " + yearDiscovered + "\n";
    }

}
