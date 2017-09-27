package ui.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import MVP_coms_classes.LoginPOpsImpl;
import MVP_coms_classes.MVP_Main;
import teamjapannumbahone.tickettoride.R;

public class LoginActivity extends AppCompatActivity {

    private MVP_Main.LoginPresentOps mPresenter = new LoginPOpsImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

}
