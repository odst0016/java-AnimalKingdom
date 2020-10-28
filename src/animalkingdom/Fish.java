package animalkingdom;

public class Fish extends Animals {

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String getMovement() {
        return "Swim";
    }

    @Override
    public String getBreath() {
        return "Gills";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
    }
}
