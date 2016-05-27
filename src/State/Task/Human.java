package State.Task;

import State.Task.Activities.Activity;
import State.Task.Locations.Locate;
import State.Task.Sees.See;

/**
 * Created by Денис on 28.05.2016.
 */
public class Human {

    private Activity activity;
    private Locate locate;
    private See see;

    public Human(Activity activity, Locate locate, See see) {
        this.activity = activity;
        this.locate = locate;
        this.see = see;
    }

    public void doSomething() {
        locate.doSomething(this);
        see.doSomething(this);
        activity.doSomething(this);
        System.out.println();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setLocate(Locate locate) {
        this.locate = locate;
    }

    public void setSee(See see) {
        this.see = see;
    }
}
