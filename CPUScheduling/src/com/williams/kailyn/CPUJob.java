package com.williams.kailyn;

public class CPUJob {
    private int priority;
    private String taskName;
    private int timeSlices;

    public CPUJob(String taskName,int priority, int timeSlices){
        this.priority=priority;
        this.taskName=taskName;
        this.timeSlices= timeSlices;

    }

    public int getPriority() {
        return priority;
    }

   public int getTimeSlices(){
        return timeSlices;
   }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String toString() {
        return "CPUJob{" +
                "Priority: " + priority +
                ", TaskName: '" + taskName + '\'' +
                ", TimeSlices: " + timeSlices +
                '}';
    }
}
