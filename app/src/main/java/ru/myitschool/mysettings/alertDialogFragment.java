package ru.myitschool.mysettings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class alertDialogFragment extends Fragment implements View.OnClickListener {
    Button accept, decline;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.alert_dialog_fragment, container, false);
        accept = (Button) fragment.findViewById(R.id.alert_button_ok);
        decline = (Button) fragment.findViewById(R.id.alert_button_dismiss);
        accept.setOnClickListener(this);
        decline.setOnClickListener(this);

        return fragment;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.alert_button_ok:
                startActivity(new Intent(getContext(), RegActivity.class));
                break;
            case R.id.alert_button_dismiss:
                getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fragment_disappear,
                        R.anim.fragment_disappear).remove(this).commit();
                break;
        }
    }
}