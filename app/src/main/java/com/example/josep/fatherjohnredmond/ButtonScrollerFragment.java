package com.example.josep.fatherjohnredmond;
/**
 * Created by joseph on 2017-12-02.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.AppCompatImageButton;
import android.widget.Button;
import android.widget.ImageButton;

public class ButtonScrollerFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.button_scroller, container, false);
        return view;
    }
}
