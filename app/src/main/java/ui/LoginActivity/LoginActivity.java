package ui.LoginActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import teamjapannumbahone.tickettoride.R;

public class LoginActivity extends AppCompatActivity implements LoginViewInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
