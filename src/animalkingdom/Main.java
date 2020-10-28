package animalkingdom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animals> animalsCollection = new ArrayList<>();

        // mammals
        animalsCollection.add(new Mammals("Panda", 1869));
        animalsCollection.add(new Mammals("Zebra", 1778));
        animalsCollection.add(new Mammals("Koala", 1816));
        animalsCollection.add(new Mammals("Sloth", 1804));
        animalsCollection.add(new Mammals("Armadillo", 1758));
        animalsCollection.add(new Mammals("Raccoon", 1758));
        animalsCollection.add(new Mammals("Bigfoot", 2021));

        // birds
        animalsCollection.add(new Birds("Piegeon", 1837));
        animalsCollection.add(new Birds("Peacock", 1821));
        animalsCollection.add(new Birds("Toucan", 1758));
        animalsCollection.add(new Birds("Parrot", 1824));
        animalsCollection.add(new Birds("Swan", 1758));

        // fish
        animalsCollection.add(new Fish("Salmon", 1758));
        animalsCollection.add(new Fish("Catfish", 1817));
        animalsCollection.add(new Fish("Perch", 1758));

        System.out.println(animalsCollection);

        filteredAnimals(animalsCollection, a -> a instanceof Mammals);

        animalsCollection.sort((a1, a2) -> (a1.getYear() > a2.getYear()) ? 1 : -1);
        System.out.println(animalsCollection);

        animalsCollection.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalsCollection);

        animalsCollection.sort((a1, a2) -> a1.getMovement().compareToIgnoreCase(a2.getMovement()));
        System.out.println(animalsCollection);

        filteredAnimals(animalsCollection, a -> a.getBreath().equalsIgnoreCase("lungs"));

        filteredAnimals(animalsCollection, a -> a.getBreath().equalsIgnoreCase("lungs") && a.getYear() == 1758);

        filteredAnimals(animalsCollection,
                a -> a.getReproduce().equalsIgnoreCase("eggs") && a.getBreath().equalsIgnoreCase("lungs"));

        animalsCollection.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals(animalsCollection, a -> (a.getYear() == 1758));

    }

    public static void filteredAnimals(List<Animals> animalsCollection, AnimalTester animalTester) {
        for (Animals a : animalsCollection) {
            if (animalTester.test(a)) {
                System.out.println(a);
            }
            System.out.println();
        }
    }

}