package com.example.kelvinharron.mind_body_bro;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Conor Fox on 11/19/2016.
 */

public class Goal {

    private static String goalName;
    private static String goalType;
    private static Calendar createdDate;
    private static int goalPriority;
    private static boolean isCompleted;
    ArrayList<String> brosOnGoal;

    public Goal(){
    }

    public  Goal(String name, String type, Calendar created, int priority, boolean completed, ArrayList<String> bros)
    {
        goalName = name;
        goalType =  type;
        createdDate = created;
        goalPriority = priority;
        isCompleted = completed;
        brosOnGoal = bros;
    }

    public void setGoalName(String name)
    {
        goalName = name;
    }

    public String getGoalName()
    {
        return goalName;
    }


    public void setGoalType(String type)
    {
        goalType = type;
    }

    public String getGoalType()
    {
        return goalType;
    }

    public void setGoalCreatedDate(Calendar created)
    {
        createdDate = created;
    }

    public Calendar getGoalCreatedDate()
    {
        return createdDate;
    }

    public void setGoalPriority(int priority)
    {
        if(priority == 0)
        {
            priority = 1;
        }
        else if(priority > 3)
        {
            priority = 3;
        }

        goalPriority = priority;
    }

    public int getGoalPriority()
    {
        return goalPriority;
    }

    public void setGoalCompleted(boolean completed)
    {
        isCompleted = completed;
    }

    public boolean getGoalCompleted()
    {
        return isCompleted;
    }

    public void setBrosOnGoal(ArrayList<String> bros)
    {
        brosOnGoal = bros;
    }

    public ArrayList<String> getBrosOnGoal()
    {
        return brosOnGoal;
    }
}
