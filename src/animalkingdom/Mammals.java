package animalkingdom;

public class Mammals extends Animals {

    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String getMovement() {
        return "Walk";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Live Births";
    }
}
