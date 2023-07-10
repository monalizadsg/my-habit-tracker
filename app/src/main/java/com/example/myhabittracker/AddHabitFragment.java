package com.example.myhabittracker;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AddHabitFragment extends Fragment {

    public AddHabitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_habit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        RecyclerView recyclerView = view.findViewById(R.id.habits_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//        RecyclerView.Adapter itemAdapter = new HabitRecyclerAdapter();
        recyclerView.setAdapter( new HabitRecyclerAdapter());
    }
}