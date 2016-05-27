package State.Task;

import State.Task.Activities.NoOne;
import State.Task.Locations.MushroomGlade;
import State.Task.Locations.NoWhere;
import State.Task.Locations.Riverside;
import State.Task.Sees.Beast;
import State.Task.Sees.Nothing;

/**
 * Created by Денис on 28.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Human(new NoOne(), new NoWhere(), new Nothing());
        human.doSomething();

        human.setLocate(new Riverside());
        human.doSomething();

        human.setLocate(new MushroomGlade());
        human.doSomething();

        human.setSee(new Beast());
        human.doSomething();
    }

}
