package edu.temple.coloractivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.Locale;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CanvasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CanvasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CanvasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CanvasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CanvasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CanvasFragment newInstance(String param1, String param2) {
        CanvasFragment fragment = new CanvasFragment();
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

        View view = inflater.inflate(R.layout.fragment_canvas, container, false);
        String CurrentLang = Locale.getDefault().getLanguage();
        TextView text = (TextView) view.findViewById(R.id.newColor);
        Fragment fragment = (Fragment) getFragmentManager().findFragmentById(R.id.secondLayout);
        final View newBackground;
        fragment.getView().setBackgroundResource(R.color.white);
        System.out.println(Locale.getDefault().getLanguage());
        Bundle b = getArguments();
        int pos = b.getInt("position");
        if(pos == 1){
            fragment.getView().setBackgroundResource(R.color.silver);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 2){
            fragment.getView().setBackgroundResource(R.color.pink);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 3){
            fragment.getView().setBackgroundResource(R.color.red);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 4){
            fragment.getView().setBackgroundResource(R.color.orange);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 5){
            fragment.getView().setBackgroundResource(R.color.yellow);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 6){
            fragment.getView().setBackgroundResource(R.color.green);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 7){
            fragment.getView().setBackgroundResource(R.color.blue);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 8){
            fragment.getView().setBackgroundResource(R.color.indigo);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 9){
            fragment.getView().setBackgroundResource(R.color.violet);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }else if(pos == 10){
            fragment.getView().setBackgroundResource(R.color.brown);
            if(CurrentLang=="es"){
                displayColorName(pos,text);
            }else{
                displayColorName(pos,text);
            }
        }
        return view;
    }
    private void displayColorName(int pos, TextView text){
        String retrieve[] = getResources().getStringArray(R.array.myStrings);
        String color = retrieve[pos];
        text.setText(color);
    }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_canvas, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
