package co.com.ceiba.daggerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import co.com.ceiba.domain.service.UserService;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ((DaggerApplication) getApplicationContext()).applicationComponent.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isCreated = userService.isCreated("01");
    }
}