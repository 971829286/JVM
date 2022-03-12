package com.test.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 一个简单的List不断放入对象生成大对象无法回收问题
 * @author:魏亚博
 * @create:2022-03-12 09:56
 */
public class example1 {
    private static final Integer K =1024;

    public static void main(String[] args) {
        int size = 10*K * K *8;
        List<byte[]> list = new ArrayList<>();
        for (int i=0;i<K;i++){

            System.out.println("JVM 写入数据"+(i+1)+"10M");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            list.add(new byte[size]);
        }
    }
}