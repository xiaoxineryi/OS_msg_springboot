package com.kaito.OS.Block;

import com.kaito.OS.semaphore.MySemaphore;

import java.util.LinkedList;


public class BufferPool {
    MySemaphore free_total;
    LinkedList<MsgBlock> msgBlockList;

    public BufferPool(int size){
        free_total = new MySemaphore(size);
        msgBlockList = new LinkedList<>();

        for(int i =0;i<size;i++){
            msgBlockList.add(new MsgBlock());
        }
    }

    public synchronized MsgBlock get(){
        free_total.P();
        return msgBlockList.removeFirst();
    }

    public synchronized void release(MsgBlock msgBlock){
        msgBlock.release();
        msgBlockList.add(msgBlock);
        free_total.V();
    }
    public synchronized int getFreeTotal(){
        return free_total.getMutex();
    }

}
