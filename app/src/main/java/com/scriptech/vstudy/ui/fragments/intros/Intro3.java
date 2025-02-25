//package com.scriptech.vstudy.ui.fragments.intros;
//
//
//import android.os.Build;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import com.scriptech.vstudy.R;
//import com.scriptech.vstudy.ui.fragments.login.Login;
//
//public class Intro3 extends Fragment implements View.OnClickListener {
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.frag_intro3, container, false);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.white));
//                getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
//            }
//        }
//
//        ((Button) v.findViewById(R.id.intro3_next)).setOnClickListener(this);
//        return v;
//    }
//
//    @Override
//    public void onClick(View v) {
//        Fragment fragment = new Login();
//        FragmentManager fragmentManager = getParentFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameContainer, fragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }
//}
