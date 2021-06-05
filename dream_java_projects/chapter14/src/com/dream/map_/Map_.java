package com.dream.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : map_Map_
 * @Author : huzejun
 * @Date: 2021/6/4-16:08
 */
public class Map_ {
    public static void main(String[] args) {
        //作者解读Map 接口实现类的特点,使用实现类HashMap
        //1.Map与Collection 并列存在，用于保存具有映射关系的数据：key-Value(双列元素)
        //2. Map中的 key 和 Value 可以是任何引用类型的数据，会封装到HashMap $ Node 对象中
        //3.Map 中的 key 不允许重复，原因和HashSet 一样
        //4.Map 中的 value 可以重复
        //5.Map 中的key 可以为null,value也可以为null, 注意 key 为 null
        //  只能有一个，value为null,可以多个
        //6.常用String类作为 Map的 key
        //7. key 和 value之间存在单向 一对一关系，即通过指定的 key 总级找到对应的 value

        Map map = new HashMap();
        map.put("no1","张三丰");   //k-v
        map.put("no2","张无忌");   // k-v
        map.put("no1","马孟起");   //当中相同的k,就等于替换
        map.put("no3","马孟起");   //k-v
        map.put(null,null); //k-v
        map.put(null,"abc"); //等价替换
        map.put("no4",null); //k-v
        map.put("no5",null);
        map.put(1,"赵敏");
        map.put(new Object(),"谢逊");

        //通过get方法，传入key,会返回对应的 value
        System.out.println(map.get("no2")); // 张无忌

        System.out.println("map=" + map);



    }
}
