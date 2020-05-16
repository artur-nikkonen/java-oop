package homework1.sportsmen;

public class Human implements Sportsman {

    private static final String typeName = "Человек";
    private String name;
    private double maxRunDistance;
    private double maxJump;

    public Human(String name, double maxRunDistance, double maxJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println(typeName + " " + name + " пробежал дистанцию " + distance + " [<= " + maxRunDistance + "]");
            return true;
        } else {
            System.out.println(typeName + " " + name + " не смог пробежать дистанцию " + distance + " [> " + maxRunDistance + "]");
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height <= maxJump) {
            System.out.println(typeName + " " + name + " перепрегнул стену высотой " + height + " [<= " + maxJump + "]");
            return true;
        } else {
            System.out.println(typeName + " " + name + " не смог перепрегнуть стену высотой " + height + " [> " + maxJump + "]");
            return false;
        }
    }
}
