package slav40.myheroacademy.views;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import slav40.myheroacademy.R;
import slav40.myheroacademy.models.Character;
import slav40.myheroacademy.models.CharacterData;

public class HeroesListFragment extends Fragment
{
    private ListView mHeroesListView;
    private ArrayAdapter<Character> mHeroesAdapter;

    public HeroesListFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_heroes_list, container, false);

        mHeroesListView = view.findViewById(R.id.lv_heroes);
        mHeroesAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);
        mHeroesListView.setAdapter(mHeroesAdapter);

        CharacterData data = new CharacterData();
        ArrayList<Character> heroesList = data.getCharacters();

        for (Character c : heroesList)
        {
            mHeroesAdapter.add(c);
        }

        /*mHeroesListView.setOnItemClickListener(v ->
        {
            Intent intent = new Intent();
        });*/

        return view;
    }

    public static HeroesListFragment createInstance()
    {
        return new HeroesListFragment();
    }
}
