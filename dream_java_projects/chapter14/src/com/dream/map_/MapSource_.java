package com.dream.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author : huzejun
 * @Date: 2021/6/4-18:17
 */
@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","张三丰");   //k-v
        map.put("no2","张无忌");   //k-v
        map.put(new Car(),new Person()); //k-v

        //作者解读
        //1. k-v 最后是 HashMap$Node node = newNode(hash,key,value,null)
        //2. k-v 为了方便程序员的遍历，还会 创建 EntrySet 集合，该集合存放的元素的类型 Entry,而一个entry对象
        //就有key,value EntrySet<Entry<K,V>> 即：transient set<Map.Entry<K,V>> entrySet;
        //3. entrySet 中，定义的类型是 Map.Entry, 但是实际上它存放的还是 HashMap $ node
        //  这是因为 HashMap$Node implements Map.Entry
        //4.当把 HashMap $ Node 对象存放到 entrySet 就方便我们的遍历，因为 map.Entry 提供了重要方法
        // Key getKey(); V getValue();


        Set set = map.entrySet();
        System.out.println(set.getClass()); //EntrySet
        for (Object obj : set){

//            System.out.println(obj.getClass());   //HashMap$node
            //为了从 HashMap$Node 取出k-v
            //1.先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }
        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());

    }

}

class Car {

}

class Person {

}