package com.dream.study.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20 -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Author: huzejun
 * @Date: 2020/12/14 20:21
 */
public class HeapOOM {

    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
