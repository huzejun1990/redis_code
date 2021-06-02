package com.dream.set_;

import java.util.HashSet;

/**
 * @ClassName : HashSetSource
 * @Author : huzejun
 * @Date: 2021/5/21-18:16
 */
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);

        /*
         HashSet 的源码解读
         1、执行 HashSet()
           public HashSet() {
              map = new HashMap<>();
          }

          2. 执行 add()
              public boolean add(E e) {
                 return map.put(e, PRESENT)==null;
             }
          3、执行 put()
          public V put(K key, V value) {
              return putVal(hash(key), key, value, false, true);
          }

         */


    }
}
