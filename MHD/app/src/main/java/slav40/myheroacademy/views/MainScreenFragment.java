package slav40.myheroacademy.views;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import slav40.myheroacademy.R;


public class MainScreenFragment extends Fragment
{
    private ImageButton mHeroButton;

    public MainScreenFragment()
    {
        // Required empty public constructor
    }

    public static MainScreenFragment createInstance()
    {
        return new MainScreenFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);

        mHeroButton = view.findViewById(R.id.hero_btn);
        mHeroButton.setOnClickListener(v ->
        {
            Intent intent = new Intent(getContext(), HeroesListActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
