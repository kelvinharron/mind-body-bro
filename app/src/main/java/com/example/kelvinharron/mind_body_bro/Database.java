package com.example.kelvinharron.mind_body_bro;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * Created by Conor Fox on 11/19/2016.
 */

public class Database {

    private ArrayList<Goal> Goals;

    public void setupData() {

        Goals = new ArrayList<Goal>();
        Goal goal1 = new Goal("Walk out my front door", "Grow", "2016:1:12", 1, true, new ArrayList<String>());
        Goals.add(goal1);

        Goal goal2 = new Goal("Learn how to say Hello in French", "Grow", "2017,1,12", 2, false, new ArrayList<String>());
        Goals.add(goal2);

        Goal goal3 = new Goal("Read the bible", "Grow", "2017,5,17", 2, false, new ArrayList<String>());
        Goals.add(goal3);

        Goal goal4 = new Goal("Rewrite the bible", "Grow", "2017:4:9", 1, false, new ArrayList<String>());
        Goals.add(goal4);

        Goal goal5 = new Goal("Walk out my front door", "Move", "2016:1:12", 1, true, new ArrayList<String>());
        Goals.add(goal5);

        Goal goal6 = new Goal("Walk a mile", "Move", "2017:1:12", 2, false, new ArrayList<String>());
        Goals.add(goal6);

        Goal goal7 = new Goal("Walk 2 miles", "Move", "2017:5:17", 2, false, new ArrayList<String>());
        Goals.add(goal7);

        Goal goal8 = new Goal("Walk 100 miles", "Move", "2017:4:9", 1, false, new ArrayList<String>());
        Goals.add(goal8);

        Goal goal9 = new Goal("Walk out my front door", "Bro", "2016:1:12", 1, true, new ArrayList<String>());
        Goals.add(goal9);

        Goal goal10 = new Goal("Walk a mile", "Bro", "2017:1:12", 2, false, new ArrayList<String>());
        Goals.add(goal10);

        Goal goal11 = new Goal("Walk 2 miles", "Bro", "2017:5:17", 2, false, new ArrayList<String>());
        Goals.add(goal11);

        Goal goal12 = new Goal("Walk 100 miles", "Bro", "2017:4:9", 1, false, new ArrayList<String>());
        Goals.add(goal12);

        Goal goal13 = new Goal("Go to the cinema with Dave", "Bros", "2016:1:12", 1, true, new ArrayList<String>());
        Goals.add(goal13);

        Goal goal14 = new Goal("Poker Night", "Bros", "2017:1:12", 2, false, new ArrayList<String>());
        Goals.add(goal14);

        Goal goal15 = new Goal("Walk 100 miles with Dave", "Bros", "2017:4:9", 1, false, new ArrayList<String>());
        Goals.add(goal15);
    }

    public void AddGoal(Goal goal) {
        Goals.add(goal);
    }

    public ArrayList<Goal> getAllGoals() {
        return Goals;
    }

    public ArrayList<Goal> getBroGoals() {
        ArrayList<Goal> broGoals = new ArrayList<Goal>();

        for (int i = 0; i < Goals.size(); i++) {
            if (Goals.get(i).getGoalType() == "Bro") {
                broGoals.add(Goals.get(i));
            }
        }
        return broGoals;
    }

    public ArrayList<Goal> getBrosGoals() {

        ArrayList<Goal> broGoals = new ArrayList<Goal>();

        for (int i = 0; i < Goals.size(); i++) {
            if (Goals.get(i).getGoalType() == "Bros") {
                broGoals.add(Goals.get(i));
            }
        }
        return broGoals;


    }

    public ArrayList<Goal> getGrowGoals() {

        ArrayList<Goal> broGoals = new ArrayList<Goal>();

        for (int i = 0; i < Goals.size(); i++) {
            if (Goals.get(i).getGoalType() == "Grow") {
                broGoals.add(Goals.get(i));
            }
        }
        return broGoals;

    }

    public ArrayList<Goal> getMoveGoals() {

        ArrayList<Goal> broGoals = new ArrayList<Goal>();

        for (int i = 0; i < Goals.size(); i++) {
            if (Goals.get(i).getGoalType() == "Move") {
                broGoals.add(Goals.get(i));
            }
        }
        return broGoals;

    }
}