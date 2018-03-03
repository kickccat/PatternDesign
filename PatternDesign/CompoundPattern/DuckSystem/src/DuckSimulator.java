import model.AbstractDuckFactory;
import model.CountingDuckFactory;
import model.QuackOlogist;
import model.Quackable;
import service.Flock;
import service.QuackCounter;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable mallardDuck = duckFactory.createMallarDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(rubberDuck);

        System.out.println("\nDuck Simulator: with Observer");
        QuackOlogist ologist = new QuackOlogist();
        flockOfDucks.registerObserver(ologist);
        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
