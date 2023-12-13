package kata;

import java.util.List;

public class ConstructionSite {

    public static void main(String... args) {

        List.of(
            new House("blue house", "blue", 3),
            new House("red house", "red", 2),
            new House("green house", "green", 1)
        ).forEach(House::build);
    }
}
