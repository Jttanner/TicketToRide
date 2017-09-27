package clientModel;

import MVP_coms_classes.MVP_Main;
import presenters.LoginPresenter;

/**
 * Created by tyler on 9/27/2017.
 */
public class StateMaintainer {
    //TODO make this more general to cover all presenters
    private MVP_Main.ProvidedLoginPresentOps presenter;

    public StateMaintainer(MVP_Main.ProvidedLoginPresentOps presenter) {
        this.presenter = presenter;
    }

    public MVP_Main.ProvidedLoginPresentOps getPresenter() {
        return presenter;
    }

    public void setPresenter(MVP_Main.ProvidedLoginPresentOps presenter) {
        this.presenter = presenter;
    }
}
