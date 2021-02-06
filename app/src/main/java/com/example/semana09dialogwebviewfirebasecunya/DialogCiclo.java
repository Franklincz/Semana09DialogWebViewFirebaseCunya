package com.example.semana09dialogwebviewfirebasecunya;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class DialogCiclo extends DialogFragment {




    public Dialog onCreateDialog(Bundle savedInstanceState){


              final String[] items = new String[] {"2018-2","2018-1","2017-2","2017-1"};
              final TextView tvSeleccion = (TextView) getActivity().findViewById(R.id.tvSeleccion);

              AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
              builder.setTitle("Seleccione el ciclo ").setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialogInterface, int i) {

                  tvSeleccion.setText(items[i]);
                  dialogInterface.dismiss();
      }
      });


            return builder.create();



    }



}
