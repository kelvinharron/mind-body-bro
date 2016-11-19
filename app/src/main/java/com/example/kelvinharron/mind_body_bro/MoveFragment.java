package com.example.kelvinharron.mind_body_bro;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by kelvinharron on 19/11/2016.
 */

public class MoveFragment extends Fragment {

    private RecyclerView recyclerView;
    private AdapterMoveGoal adapter;
    private View layout;
    private Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_move, container, false);
        createRecyclerView();
        return layout;
    }

    private void createRecyclerView() {
        recyclerView = (RecyclerView) layout.findViewById(R.id.move_goal_recyclerview);
        adapter = new AdapterMoveGoal(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public List<Goal> getData() {
        return new Database().getAllGoals();
    }
}
