package edu.temple.coloractivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaletteFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaletteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public static PaletteFragment newIntance(){
        return new PaletteFragment();
    }
    public PaletteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PaletteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PaletteFragment newInstance(String param1, String param2) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_palette, container, false);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                getActivity(), R.array.myColors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> stringNames = ArrayAdapter.createFromResource(getActivity(), R.array.myStrings, android.R.layout.simple_spinner_item);
        stringNames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> stringName = ArrayAdapter.createFromResource(getActivity(),R.array.myStrings, android.R.layout.simple_spinner_item);
        stringName.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        View v = inflater.inflate(R.layout.fragment_palette,container,false);
        spinner = v.findViewById(R.id.spinner);
        spinner.setAdapter(new ColorAdapter(getActivity()));

        spinner = v.findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ViewGroup container;
                if(position == 0){
                }
                else if(position == 1){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 2){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 3){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 4){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 5){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 6){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 7){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 8){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 9){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }else if(position == 10){
                    Bundle args = new Bundle();
                    args.putInt("position",position);
                    CanvasFragment newFragment = new CanvasFragment();
                    newFragment.setArguments(args);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        return v;
    }

}