package com.kaito.Service;

import com.kaito.OS.Character.MyThread;
import com.kaito.OS.System.MySystem;
import com.kaito.RunnableThread.ReceiveThread;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ReceiveService {
    
    public void receive(int receiver_pid) {
        Map<Integer, MyThread> map = MySystem.getThreadsMap();
        MyThread receiver = map.get(receiver_pid);
        Thread thread = new ReceiveThread(receiver);
        thread.start();
        // 一定要同步
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String getMsg(int receiver_pid) {
        Map<Integer, MyThread> map = MySystem.getThreadsMap();
        MyThread receiver = map.get(receiver_pid);
        return new String(receiver.getMsg());
    }

    public int getSenderId(int receiver_pid) {
        Map<Integer, MyThread> map = MySystem.getThreadsMap();
        MyThread receiver = map.get(receiver_pid);
        return receiver.getSender_pid();
    }
}
