package animalkingdom;

public class Mammals extends Animals {

    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    public String getMovement() {
        return "Walk";
    }

    public String getBreath() {
        return "Lungs";
    }

    public String getReproduce() {
        return "Live Births";
    }
}
