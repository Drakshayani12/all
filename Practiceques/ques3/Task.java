package Practiceques.ques3;

public class Task {
    private String name;
    private String date;
    private String status;

    public Task(String name,String date,String status)
    {
        this.name = name;
        this.date = date;
        this.status = status;
    }
    public Task(){}
    public String getName(){
        return this.name;

    }
    public String getDueDate(){
        return this.date;
    }
    public String getStatus(){
        return this.status;
    }
public void setName(String name){
    this.name = name;
}
public void setDueDate(String date)
{
    this.date = date;
}
public void setStatus(String status)
{
this.status = status;
}
public String toString(){
    return "Task: "+this.name+" | Due Date: "+this.date+ " | Status: "+this.status;
}
}
//1. Task: Complete Project | Due Date: 2024-02-15 | Status: To Do