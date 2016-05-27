package State.Task.Locations;

import State.Task.Activities.Fisher;
import State.Task.Human;

/**
 * Created by Денис on 28.05.2016.
 */
public class Riverside implements Locate {

    @Override
    public void doSomething(Human context) {
        where();
        context.setActivity(new Fisher());
    }

    @Override
    public void where() {
                System.out.println("location:   riverside");
    }
}
