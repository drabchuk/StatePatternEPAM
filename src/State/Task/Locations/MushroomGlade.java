package State.Task.Locations;

import State.Task.Activities.Mushroomer;
import State.Task.Human;

/**
 * Created by Денис on 28.05.2016.
 */
public class MushroomGlade implements Locate {

    @Override
    public void doSomething(Human context) {
        where();
        context.setActivity(new Mushroomer());
    }

    @Override
    public void where() {
        System.out.println("location:   mushroom glade");
    }
}
