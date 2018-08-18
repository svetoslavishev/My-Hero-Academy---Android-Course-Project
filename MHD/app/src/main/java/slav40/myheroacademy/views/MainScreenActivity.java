package slav40.myheroacademy.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import slav40.myheroacademy.R;

public class MainScreenActivity extends AppCompatActivity
{
    private MainScreenFragment mMainScreenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        mMainScreenFragment = MainScreenFragment.createInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mMainScreenFragment)
                .commit();
    }
}
