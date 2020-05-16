package homework1.exercises;

import homework1.sportsmen.Sportsman;

public class Wall extends Exercise {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean DoExercise(Sportsman sportsman) {
        return sportsman.jump(height);
    }
}
