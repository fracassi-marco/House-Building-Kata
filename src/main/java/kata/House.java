package kata;

public class House {

    private final String name;
    private final String color;
    private final int floors;

    public House(String name, String color, int floors) {
        this.name = name;
        this.color = color;
        this.floors = floors;
    }

    public void build() {
        buildFoundation();
        buildPillars();
        buildFloors();
        buildWindows();
        buildRoof();
        paint();
    }

    private void paint() {
        System.out.println(name + ": Painting house " + color + "...");
    }

    private void buildRoof() {
        System.out.println(name + ": Building roof...");
    }

    private void buildWindows() {
        System.out.println(name + ": Building windows...");
    }

    private void buildFloors() {
        for (int i = 1; i <= floors; i++) {
            System.out.println(name + ": Building floor " + i + "...");
        }
    }

    private void buildPillars() {
        System.out.println(name + ": Building pillars...");
    }

    private void buildFoundation() {
        System.out.println(name + ": Building foundation...");
    }
}
