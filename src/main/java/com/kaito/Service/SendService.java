package com.kaito.Service;

import com.kaito.OS.Character.MyThread;
import com.kaito.OS.System.MySystem;
import com.kaito.RunnableThread.SendThread;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SendService {

    public boolean hasReceiver(int receiver_pid) {
        Map map = MySystem.getThreadsMap();
        if (map.containsKey(receiver_pid)){
            return true;
        }else {
            return false;
        }
    }

    public void send(int sender_pid, int receiver_pid, String msg) {
        Map<Integer,MyThread> map = MySystem.getThreadsMap();
        MyThread sender = map.get(sender_pid);
        byte[] bytes = msg.getBytes();
        new SendThread(sender,receiver_pid,bytes).start();
    }
}
