package ui.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import MVP_coms_classes.MVP_Main;
import modeling.LoginRequest;
import modeling.LoginResult;
import modeling.RegisterRequest;
import modeling.RegisterResult;
import presenters.LoginPresenter;
import teamjapannumbahone.tickettoride.R;

public class LoginActivity extends AppCompatActivity implements  MVP_Main.RequiredViewOps{

    private MVP_Main.ProvidedLoginPresentOps mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupMVP();

    }

    /**
     * Setup Model View Presenter pattern
     */
    private void setupMVP() {
        // Create the Presenter
        mPresenter = new LoginPresenter(this);
    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }

    @Override
    public Context getActivityContext() {
        return this;
    }
}
