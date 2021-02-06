package com.example.semana09dialogwebviewfirebasecunya;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class PaginaFragment extends Fragment {


    private Button btnVisualizar;
    private EditText txtUrl;
    private WebView wvPagina;




    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


           View view = inflater.inflate(R.layout.fragment_pagina , container, false);




           txtUrl = (EditText) view.findViewById(R.id.txtUrl);
           wvPagina = (WebView) view.findViewById(R.id.wvPagina);



  btnVisualizar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          wvPagina.getSettings().setJavaScriptEnabled(true);
          wvPagina.setWebViewClient(new WebViewClient());
          wvPagina.loadUrl("http://"+ txtUrl.getText().toString());
      }
  });


        return view;
    }
}


















