package com.example.kelvinharron.mind_body_bro;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by kelvinharron on 19/11/2016.
 */

public class AdapterMoveGoal extends RecyclerView.Adapter<AdapterMoveGoal.GoalViewHolder> {

    private LayoutInflater inflater;
    private List<Goal> moveGoalData = Collections.emptyList();
    private Goal goal;

    public AdapterMoveGoal(Context context, List<Goal> moveGoalData) {
        inflater = LayoutInflater.from(context);
        this.moveGoalData = moveGoalData;
    }

    @Override
    public GoalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View goalView = inflater.inflate(R.layout.card_goal, parent, false);
        GoalViewHolder holder = new GoalViewHolder(goalView);
        return holder;
    }

    @Override
    public void onBindViewHolder(GoalViewHolder holder, final int posistion) {
        goal = moveGoalData.get(posistion);


    }

    @Override
    public int getItemCount() {
        //moveGoalData.size()
        return 0;
    }

    public void deleteGoal(int position) {
        goal = moveGoalData.get(position);
        Database db = new Database();
        // DELETE GOAL
        moveGoalData.remove(position);
        notifyItemRemoved(position);
        Toast.makeText(inflater.getContext(), "You did it!\nGoal Completed!!", Toast.LENGTH_LONG).show();
    }

    class GoalViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {

        protected TextView goalName;
        protected TextView goalDateCreated;
        protected TextView goalPriority;

        public GoalViewHolder(View itemView) {
            super(itemView);
            itemView.setOnLongClickListener(this);
            goalName = (TextView) itemView.findViewById(R.id.goal_name);
            goalDateCreated = (TextView) itemView.findViewById(R.id.goal_date);
            goalPriority = (TextView) itemView.findViewById(R.id.goal_priority);
        }

        @Override
        public boolean onLongClick(View v) {
            deleteGoal(getLayoutPosition());
            return false;
        }
    }
}
