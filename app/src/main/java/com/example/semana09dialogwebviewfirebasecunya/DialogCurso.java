package com.example.semana09dialogwebviewfirebasecunya;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogCurso  extends DialogFragment {




    public Dialog onCreateDialog( Bundle savedInstanceState) {


        final String[] items =  new String []{ "Investigación Operativa" ,"Robótica","Desarrollo de Aplicaciones Móviles" , "Estática"};
        final TextView tvSeleccion = (TextView) getActivity().findViewById(R.id.tvSeleccion);


        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());


        builder.setTitle("Seleccione el curso").setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {


                tvSeleccion.setText(items[i]);
                dialog.dismiss();


            }
        });



















        return builder.create();
    }




}
