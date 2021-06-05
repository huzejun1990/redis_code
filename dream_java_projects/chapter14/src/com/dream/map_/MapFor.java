package com.dream.map_;

import javax.imageio.stream.IIOByteBuffer;
import java.util.*;

/**
 * @Author : huzejun
 * @Date: 2021/6/5-15:24
 */

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("张三","李四");
        map.put("颜良","文丑");
        map.put("袁绍","文丑");
        map.put("刘备",null);
        map.put(null,"孙权");
        map.put("吕布","貂婵");

        //第一组：先取出 所有的Key, 通过Key 取出对应的Value
        Set keySet = map.keySet();
        //(1) 增强for
        System.out.println("--------第一种方式----------");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }

        //（2迭代器）
        System.out.println("--------第二种方式----------");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的values取出
        Collection values = map.values();
        //这里可以使用所有的Collections使用遍历方法
        //(1) 增强for
        System.out.println("-------------取出所有的value 增强for------");
        for (Object value : values) {
            System.out.println(value);
        }

        //(2) 迭代器
        System.out.println("-------------取出所有的value 迭代器------");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()){
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组，通过EntrySet 来获取 key
        Set entrySet = map.entrySet();
        //(1)增强for
        System.out.println("-----使用EntrySet 的for 增强（第3种）-----");
        for (Object entry : entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //(2) 迭代器
        System.out.println("-----使用EntrySet 的 迭代器（第4种）-----");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()){
            Object entry = iterator3.next();
//            System.out.println(next.getClass());    //HashMap$Node -实现 MapEntry(getKey,getValue)
            //向下转型 HashMap$Node
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }

}
