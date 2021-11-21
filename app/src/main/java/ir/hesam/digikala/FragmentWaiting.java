package ir.hesam.digikala;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentWaiting extends Fragment {
    View view;
    int position;


    public FragmentWaiting(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.waiting_fragment, container, false);
//        view = inflater.inflate(R.layout.waiting_fragment,container,false);
//        return view;
    }
}
