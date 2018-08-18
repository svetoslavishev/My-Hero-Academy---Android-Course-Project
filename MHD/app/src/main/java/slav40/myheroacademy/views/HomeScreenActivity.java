package slav40.myheroacademy.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import slav40.myheroacademy.R;

public class HomeScreenActivity extends AppCompatActivity
{
    private HomeScreenFragment mHomeScreenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mHomeScreenFragment = HomeScreenFragment.createInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.home, mHomeScreenFragment)
                .commit();
    }
}
