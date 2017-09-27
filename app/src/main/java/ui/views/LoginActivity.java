package ui.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import MVP_coms_classes.MVP_Main;
import modeling.LoginRequest;
import modeling.LoginResult;
import modeling.RegisterRequest;
import modeling.RegisterResult;
import teamjapannumbahone.tickettoride.R;

public class LoginActivity extends AppCompatActivity implements MVP_Main.LoginPresentOps, MVP_Main.RequiredViewOps{

    private MVP_Main.LoginPresentOps mPresenter;// = new LoginPOpsImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    @Override
    public LoginResult Login(LoginRequest request) {
        return mPresenter.Login(request);
    }

    @Override
    public RegisterResult Register(RegisterRequest request) {
        return mPresenter.Register(request);
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
