package State.Task.Activities;

import State.Task.Human;

/**
 * Created by Денис on 28.05.2016.
 */
public class Mushroomer implements Activity {

    @Override
    public void doSomething(Human context) {
        System.out.println("do:         mushroom");
    }
}
