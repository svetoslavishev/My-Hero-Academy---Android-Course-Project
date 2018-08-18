package slav40.myheroacademy.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import slav40.myheroacademy.R;

public class CharacterDetailsFragment extends Fragment
{
    private ImageView mCharacterImage;

    public CharacterDetailsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_character_details, container, false);

        return view;
    }

    public static CharacterDetailsFragment createInstance()
    {
        return new CharacterDetailsFragment();
    }
}
