package clientModel;

import android.util.Log;

import java.util.List;

import MVP_coms_classes.MVP_Main;
import presenters.LoginPresenter;
import presenters.Presenter;

/**
 * Created by tyler on 9/27/2017.
 * Holds the presenter for the activity should the activity be destroyed, so we don't lose our data
 */
public class StateMaintainer {
    //TODO make this more general to cover all presenters
    private List<Presenter> presenters;
    private final String TAG = "StateMaintainer";

    public StateMaintainer(Presenter presenter) {
        presenters.add(presenter);
    }

    public Presenter getPresenter(String name) {
        for(Presenter obj : presenters){
            if(obj.getClass().getName().equals(name)){
                return obj;
            }
        }
        Log.d(TAG,"Presenter not found");
        return null;
    }

    public void addPresenter(Presenter presenter) {
        presenters.add(presenter);
    }
}
