package com.example.kelvinharron.mind_body_bro;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * Created by Conor Fox on 11/19/2016.
 */

public class Database {
    
    private static ArrayList<Goal> Goals;
    private static Calendar date;

    public static void setupData()  {

        date.set(2016,1,12);
        Goal goal1 = new Goal("Walk out my front door","Grow",date,1,true, new ArrayList<String>());
        Goals.add(goal1);

        date.set(2017,1,12);
        Goal goal2 = new Goal("Learn how to say Hello in French","Grow",date,2,false, new ArrayList<String>());
        Goals.add(goal2);

        date.set(2017,5,17);
        Goal goal3 = new Goal("Read the bible","Grow",date,2,false, new ArrayList<String>());
        Goals.add(goal3);

        date.set(2017,4,9);
        Goal goal4 = new Goal("Rewrite the bible","Grow",date,1,false, new ArrayList<String>());
        Goals.add(goal4);

        date.set(2016,1,12);
        Goal goal5 = new Goal("Walk out my front door","Move",date,1,true, new ArrayList<String>());
        Goals.add(goal5);

        date.set(2017,1,12);
        Goal goal6 = new Goal("Walk a mile","Move",date,2,false, new ArrayList<String>());
        Goals.add(goal6);

        date.set(2017,5,17);
        Goal goal7 = new Goal("Walk 2 miles","Move",date,2,false, new ArrayList<String>());
        Goals.add(goal7);

        date.set(2017,4,9);
        Goal goal8 = new Goal("Walk 100 miles","Move",date,1,false, new ArrayList<String>());
        Goals.add(goal8);

        date.set(2016,1,12);
        Goal goal9 = new Goal("Walk out my front door","Bro",date,1,true, new ArrayList<String>());
        Goals.add(goal9);

        date.set(2017,1,12);
        Goal goal10 = new Goal("Walk a mile","Bro",date,2,false, new ArrayList<String>());
        Goals.add(goal10);

        date.set(2017,5,17);
        Goal goal11 = new Goal("Walk 2 miles","Bro",date,2,false, new ArrayList<String>());
        Goals.add(goal11);

        date.set(2017,4,9);
        Goal goal12 = new Goal("Walk 100 miles","Bro",date,1,false, new ArrayList<String>());
        Goals.add(goal12);

        date.set(2016,1,12);
        Goal goal13= new Goal("Go to the cinema with Dave","Bros",date,1,true, new ArrayList<String>());
        Goals.add(goal13);

        date.set(2017,1,12);
        Goal goal14 = new Goal("Poker Night","Bros",date,2,false, new ArrayList<String>());
        Goals.add(goal14);

        date.set(2017,4,9);
        Goal goal15 = new Goal("Walk 100 miles with Dave","Bros",date,1,false, new ArrayList<String>());
        Goals.add(goal15);
    }

    public void AddGoal(Goal goal)
    {
        Goals.add(goal);
    }

    public ArrayList<Goal> getAllGoals()
    {
        return Goals;
    }

    public ArrayList<Goal> getBroGoals()
    {
        ArrayList<Goal> broGoals = new ArrayList<Goal>();

        for(int i = 0; i < Goals.size(); i++)
        {
            if(Goals.get(i).getGoalType() == "Bro")
            {
                broGoals.add(Goals.get(i));
            }
        }
        return broGoals;
    }

    public ArrayList<Goal> getBrosGoals() {
        {
            ArrayList<Goal> broGoals = new ArrayList<Goal>();

            for(int i = 0; i < Goals.size(); i++)
            {
                if(Goals.get(i).getGoalType() == "Bros")
                {
                    broGoals.add(Goals.get(i));
                }
            }
            return broGoals;
        }

    }
    public ArrayList<Goal> getGrowGoals()
    {
        {
            ArrayList<Goal> broGoals = new ArrayList<Goal>();

            for(int i = 0; i < Goals.size(); i++)
            {
                if(Goals.get(i).getGoalType() == "Grow")
                {
                    broGoals.add(Goals.get(i));
                }
            }
            return broGoals;
        }
    }

    public ArrayList<Goal> getMoveGoals()
    {
        {
            ArrayList<Goal> broGoals = new ArrayList<Goal>();

            for(int i = 0; i < Goals.size(); i++)
            {
                if(Goals.get(i).getGoalType() == "Move")
                {
                    broGoals.add(Goals.get(i));
                }
            }
            return broGoals;
        }
    }


}
