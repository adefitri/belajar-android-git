package a.simpleapplication;

import android.content.Intent;
import android.os.Handler;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.webkit.WebViewDatabase.getInstance;

public class SplashScreen extends AppCompatActivity {
    PreferencesHelper instance;
    private PreferencesHelper PreferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        instance = PreferenceHelper,getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed() {
            if (!Instance.islogin()){
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
            } else {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        }, splashInterval;
    }
}
