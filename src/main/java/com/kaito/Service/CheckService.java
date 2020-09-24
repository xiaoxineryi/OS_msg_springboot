package com.kaito.Service;

import com.kaito.OS.Character.MyThread;
import com.kaito.OS.System.MySystem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckService {
    public int[] getUrgent() {
        List<MyThread> list = MySystem.getUrgentList();
        int size = list.size();
        int[] urgent_ids = new int[size];
        for (int i =0;i<size;i++){
            urgent_ids[i] = list.get(i).getPid();
        }
        return urgent_ids;
    }

    public int[] getReady() {
        List<MyThread> list = MySystem.getReadyList();
        int size = list.size();
        int[] ready_ids = new int[size];
        for (int i =0;i<size;i++){
            ready_ids[i] = list.get(i).getPid();
        }
        return ready_ids;
    }

    public int getTemp(){
        return MySystem.getTemp_pid();
    }
}
