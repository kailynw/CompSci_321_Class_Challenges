package com.williams.kailyn;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {

            public static void main(String[] args) {

            PriorityQueue<CPUJob> cpu= new PriorityQueue<>(new PriorityComparator());
            allTasks(cpu);

            while(cpu.size()!=0){
                CPUJob job=cpu.poll();
                System.out.println(job);

                for(int i=1; i<=job.getTimeSlices();i++){
                    System.out.println("Task Name: "+ job.getTaskName()+", "+ "TimeSlice: "+ i);
                }
                System.out.println("\nJOB COMPLETE!\n");
            }


    }
    public static int randomNum(){
        return new Random().nextInt(100);
    }

    public static void allTasks(PriorityQueue cpu){
        cpu.add(new CPUJob("A",5,randomNum()));
        cpu.add(new CPUJob("B",-20,randomNum()));
        cpu.add(new CPUJob("C",7,randomNum()));
        cpu.add(new CPUJob("D",-8,randomNum()));
        cpu.add(new CPUJob("E",3,randomNum()));
        cpu.add(new CPUJob("F",12,randomNum()));
        cpu.add(new CPUJob("G",-11,randomNum()));
        cpu.add(new CPUJob("H",13,randomNum()));
        cpu.add(new CPUJob("I",11,randomNum()));
        cpu.add(new CPUJob("J",6,randomNum()));
        cpu.add(new CPUJob("K",9,randomNum()));
        cpu.add(new CPUJob("L",10,randomNum()));
        cpu.add(new CPUJob("M",-15,randomNum()));
        cpu.add(new CPUJob("N",7,randomNum()));
        cpu.add(new CPUJob("O",-3,randomNum()));
        cpu.add(new CPUJob("P",-13,randomNum()));
        cpu.add(new CPUJob("Q",4,randomNum()));
        cpu.add(new CPUJob("R",-4,randomNum()));
        cpu.add(new CPUJob("S",16,randomNum()));



    }
}
