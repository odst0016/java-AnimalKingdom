package animalkingdom;

public class Fish extends Animals {

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    public String getMovement() {
        return "Swim";
    }

    public String getBreath() {
        return "Gills";
    }

    public String getReproduce() {
        return "Eggs";
    }
}
