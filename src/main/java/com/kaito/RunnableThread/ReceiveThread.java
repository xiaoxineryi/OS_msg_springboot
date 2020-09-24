package com.kaito.RunnableThread;

import com.kaito.OS.Character.MyThread;
import com.kaito.Service.ReceiveService;

public class ReceiveThread extends Thread {
    MyThread receiver ;
    public ReceiveThread(MyThread receiver){
        this.receiver = receiver;
    }
    @Override
    public void run() {
        receiver.receive();
    }


}
