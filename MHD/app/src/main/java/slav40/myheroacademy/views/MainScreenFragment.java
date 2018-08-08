package slav40.myheroacademy.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import slav40.myheroacademy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreenFragment extends Fragment
{
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



        return view;
    }

}
