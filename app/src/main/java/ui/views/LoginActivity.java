package ui.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import MVP_coms_classes.MVP_Main;
import clientModel.CModel;
import clientModel.StateMaintainer;
import modeling.LoginRequest;
import modeling.RegisterRequest;
import presenters.LoginPresenter;
import teamjapannumbahone.tickettoride.R;

public class LoginActivity extends AppCompatActivity implements MVP_Main.RequiredLoginViewOps {

    private MVP_Main.ProvidedLoginPresentOps mPresenter;
    private StateMaintainer mStateMaintainer;
    private Button mLoginButton;
    private Button mRegisterButton;
    private EditText mUserNameEdit;
    private EditText mPassWordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupMVP();
        setupWidgets();

    }

    
    private void setupMVP() {
        // Check if StateMaintainer has been created
        if (mStateMaintainer == null) {
            // Create the Presenter
            LoginPresenter presenter = new LoginPresenter(this);
            // Add Presenter to StateMaintainer
            mStateMaintainer = new StateMaintainer(presenter);
            // Set the Presenter as a interface
            // To limit the communication with it
            mPresenter = presenter;
            //Set the presenter in the model
            CModel.getInstance().getStateMaintainer().setPresenter(mPresenter);

        }
        // get the Presenter from StateMaintainer
        else {
            // Get the Presenter
            mPresenter = CModel.getInstance().getStateMaintainer().getPresenter();
            // Updated the View in Presenter
            mPresenter.setView(this);
        }
    }
    private void setupWidgets() {
        mLoginButton = (Button)findViewById(R.id.loginButton);
        mRegisterButton = (Button)findViewById(R.id.registerButton);
        mUserNameEdit = (EditText) findViewById(R.id.editUserName);
        mPassWordEdit = (EditText) findViewById(R.id.editPassword);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUserNameEdit.getText().toString();
                String password = mPassWordEdit.getText().toString();
                mPresenter.login(new LoginRequest(username,password));
            }
        });
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUserNameEdit.getText().toString();
                String password = mPassWordEdit.getText().toString();
                mPresenter.register(new RegisterRequest(username,password));
            }
        });
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
