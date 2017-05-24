package com.andesfit.android.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.andesfit.android.R;

/**
 * Created by Vampire on 2017-05-25.
 */

public class ProfileBdayFragment extends Fragment implements View.OnClickListener
{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.profile_setting_4,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        init();

    }

    private void init()
    {
        FrameLayout next = (FrameLayout)getView().findViewById(R.id.frameNext);
        FrameLayout previous = (FrameLayout)getView().findViewById(R.id.framePrevious);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.frameNext:
                createHeightProfile();
                break;
            case R.id.framePrevious:
                getFragmentManager().popBackStack();
                break;
        }
    }

    private void createHeightProfile()
    {
        getFragmentManager().beginTransaction().add(R.id.container, new ProfileHeightFragment()).addToBackStack(null).commit();
    }
}
