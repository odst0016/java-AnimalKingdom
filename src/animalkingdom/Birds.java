package animalkingdom;

public class Birds extends Animals {

    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String getMovement() {
        return "Fly";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
    }
}
