package animalkingdom;

public class Birds extends Animals {

    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    public String getMovement() {
        return "Fly";
    }

    public String getBreath() {
        return "Lungs";
    }

    public String getReproduce() {
        return "Eggs";
    }
}
