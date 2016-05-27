package State.Task.Sees;

import State.Task.Human;

/**
 * Created by Денис on 28.05.2016.
 */
public class Nothing implements See {

    @Override
    public void doSomething(Human context) {
        what();
    }

    @Override
    public void what() {
        System.out.println("see:        nothing");
    }
}
