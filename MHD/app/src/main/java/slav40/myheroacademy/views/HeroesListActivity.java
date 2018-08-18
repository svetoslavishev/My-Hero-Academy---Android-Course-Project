package slav40.myheroacademy.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import slav40.myheroacademy.R;

public class HeroesListActivity extends AppCompatActivity
{
    private HeroesListFragment mHeroesListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_list);

        mHeroesListFragment = HeroesListFragment.createInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.heroes_list, mHeroesListFragment)
                .commit();
    }
}
