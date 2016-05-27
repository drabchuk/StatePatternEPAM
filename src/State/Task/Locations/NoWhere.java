package State.Task.Locations;

import State.Task.Human;

/**
 * Created by Денис on 28.05.2016.
 */
public class NoWhere implements Locate {

    @Override
    public void doSomething(Human context) {
        where();
    }

    @Override
    public void where() {
        System.out.println("location:   nowhere");
    }
}
