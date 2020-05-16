package homework1.sportsmen;

public class Robot implements Sportsman {

    private static final String typeName = "Робот";
    private String name;
    private double maxRunDistance;
    private double maxJump;

    public Robot(String name, double maxRunDistance, double maxJump) {
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
