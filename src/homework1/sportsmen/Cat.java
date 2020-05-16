package homework1.sportsmen;

public class Cat implements Sportsman{

    private static final String typeName = "Кот";
    private String name;
    private double maxRunDistance;
    private double maxJump;

    public Cat(String name, double maxRunDistance, double maxJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJump = maxJump;
    }

    @Override
    public boolean Run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println(typeName + " " + name + " пробежал дистанцию " + distance + " [<= " + maxRunDistance + "]");
            return true;
        } else {
            System.out.println(typeName + " " + name + " не смог пробежать дистанцию " + distance + " [> " + maxRunDistance + "]");
            return false;
        }
    }

    @Override
    public boolean Jump(double height) {
        if (height <= maxJump) {
            System.out.println(typeName + " " + name + " перепрегнул стену высотой " + height + " [<= " + maxJump + "]");
            return true;
        } else {
            System.out.println(typeName + " " + name + " не смог перепрегнуть стену высотой " + height + " [> " + maxJump + "]");
            return false;
        }
    }
}
