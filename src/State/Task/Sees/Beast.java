package State.Task.Sees;


import State.Task.Activities.Hunetr;
import State.Task.Human;

/**
 * Created by Денис on 28.05.2016.
 */
public class Beast implements See {

    @Override
    public void doSomething(Human context) {
        what();
        context.setActivity(new Hunetr());
    }

    @Override
    public void what() {
                System.out.println("see:        beast");
    }
}
