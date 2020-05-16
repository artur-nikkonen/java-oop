package homework1;

import homework1.exercises.Exercise;
import homework1.exercises.Treadmill;
import homework1.exercises.Wall;
import homework1.sportsmen.Cat;
import homework1.sportsmen.Human;
import homework1.sportsmen.Robot;
import homework1.sportsmen.Sportsman;

public class Main {
    public static void main(String[] args) {

        Sportsman[] sportsmen = {
                new Human("Вася", 5000, 1.8),
                new Cat("Мурзик", 1000, 2.5),
                new Robot("R2D2", 50,0.1)
        };

        Exercise[] exercises = {
                new Treadmill(10.5),
                new Wall(0.05),
                new Treadmill(1000),
                new Wall(2),
                new Treadmill(2000)
        };

        for (Sportsman s: sportsmen) {

            for (Exercise e: exercises) {
                boolean pass = e.DoExercise(s);
                if(!pass) break;
            }

            System.out.println();
        }
    }
}
