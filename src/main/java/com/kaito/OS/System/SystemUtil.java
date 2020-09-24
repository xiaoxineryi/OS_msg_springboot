package com.kaito.OS.System;

import com.kaito.OS.Character.MyThread;

public class SystemUtil {
    private static Integer temp_num = 0;
    public static synchronized MyThread createMyThread(){
        MyThread myThread= new MyThread(++temp_num);
        MySystem.addMap(temp_num,myThread);
        return myThread;
    }
}
