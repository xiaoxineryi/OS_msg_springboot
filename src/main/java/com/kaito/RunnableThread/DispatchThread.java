package com.kaito.RunnableThread;

import com.kaito.OS.System.MySystem;
import com.kaito.OS.System.SystemUtil;

public class DispatchThread extends Thread{
    @Override
    public void run() {
        MySystem.dispatch();
    }
}
