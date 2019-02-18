package com.williams.kailyn;

import java.util.Comparator;

public class PriorityComparator implements Comparator<CPUJob> {

    @Override
    public int compare(CPUJob job1, CPUJob job2){
        if(job1.getPriority()>job2.getPriority())
            return 1;
        else if(job1.getPriority()==job2.getPriority())
            return 0;
        return -1;
    }
}
