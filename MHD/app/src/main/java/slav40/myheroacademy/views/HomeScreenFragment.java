package slav40.myheroacademy.views;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import slav40.myheroacademy.R;


public class HomeScreenFragment extends Fragment
{
    private ImageButton mHeroButton;
    private ImageButton mVillainButton;

    public HomeScreenFragment()
    {
        // Required empty public constructor
    }

    public static HomeScreenFragment createInstance()
    {
        return new HomeScreenFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);

        mHeroButton = view.findViewById(R.id.hero_btn);
        mHeroButton.setOnClickListener(v ->
        {
            Intent intent = new Intent(getContext(), HeroesListActivity.class);
            startActivity(intent);
        });

        mVillainButton = view.findViewById(R.id.villain_btn);
        mVillainButton.setOnClickListener(v ->
        {
            Intent intent = new Intent(getContext(), VillainsListActivity.class);
            startActivity(intent);
        });

        return view;
    }
}
