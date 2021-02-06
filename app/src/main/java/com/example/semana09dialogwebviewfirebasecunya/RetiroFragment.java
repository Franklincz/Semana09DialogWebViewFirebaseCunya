package com.example.semana09dialogwebviewfirebasecunya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;

public class RetiroFragment extends Fragment {


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,Bundle savedInstanceState) {




  View view = inflater.inflate(R.layout.fragment_retiro , container , false);

        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rgTipo);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                switch (i){


                    case R.id.rbCurso:
                        DialogCurso fragmentCurso = new DialogCurso();

                        fragmentCurso.show(getActivity().getSupportFragmentManager(), "seleccion");
                        break;







                    case R.id.rbCiclo:
                        DialogCiclo fragmentCiclo = new DialogCiclo();


                        fragmentCiclo.show(getActivity().getSupportFragmentManager(), "seleccion");
                        break;



                }



            }
        });







return view;

    }
}
