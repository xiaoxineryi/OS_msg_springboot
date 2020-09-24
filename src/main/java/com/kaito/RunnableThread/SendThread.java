package com.kaito.RunnableThread;

import com.kaito.OS.Character.MyThread;

public class SendThread extends Thread{
    private MyThread myThread;
    private int receiver_pid;
    private byte[] bytes;
    public SendThread(MyThread myThread,int receiver_pid,byte[] bytes){
        this.myThread = myThread;
        this.receiver_pid = receiver_pid;
        this.bytes = bytes;
    }
    @Override
    public void run() {
        myThread.send(bytes,receiver_pid);
    }
}
