package com.projects.aldajo.barnavigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AnotherFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.another_layout, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);

        recyclerAdapter.addItem(new Item("Pedidos Anteriores"));
        recyclerAdapter.addItem(new Item("25 DE NOV", "Calle 66"));
        recyclerAdapter.addItem(new Item("25 DE NOV", "Calle 66"));
        recyclerAdapter.addItem(new Item("25 DE NOV", "Calle 66"));
    }
}
