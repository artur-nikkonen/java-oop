package homework1.exercises;

import homework1.sportsmen.Sportsman;

public class Treadmill extends Exercise {

    private double distance;

    public Treadmill(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean DoExercise(Sportsman sportsman) {
        return sportsman.run(distance);
    }
}
