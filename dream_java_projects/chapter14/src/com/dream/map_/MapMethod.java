package com.dream.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : huzejun
 * @Date: 2021/6/4-19:27
 */
public class MapMethod {
    public static void main(String[] args) {
        //演示map接口常用方法
        Map map = new HashMap();
        map.put("张三",new Book("",100));
        map.put("张三","李四");
        map.put("颜良","文丑");
        map.put("武帅","文丑");
        map.put("关云长","张飞");
        map.put("刘若英",null);
        map.put(null,"孙伯符");
        map.put("吕布","貂蝉");
        map.put("刘备","偏安一隅");

        System.out.println("Map = " + map);

        // remove:根据键删除映射关系
        map.remove(null);
        System.out.println("map=" + map);
        // get: 根据获取获取值
        Object val = map.get("吕布");
        System.out.println("val=" + val);
        // size: 获取元素个数
        System.out.println("k-v= " + map.size());
        // isEpty:判断个数是否为0
        System.out.println(map.isEmpty()); //false
        // clear:清除
//        map.clear();
        System.out.println("map=" + map);
        // containsKey:查找键是否存在
        System.out.println("结果是=" + map.containsKey("刘备")); //false
    }

}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
