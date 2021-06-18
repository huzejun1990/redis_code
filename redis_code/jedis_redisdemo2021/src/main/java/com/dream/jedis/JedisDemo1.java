package com.dream.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @Author : huzejun
 * @Date: 2021/6/18-20:38
 */
public class JedisDemo1 {

    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.31.60",6379);

        //测试
        String value = jedis.ping();
        System.out.println(value);
    }

    //操作key
    @Test
    public void demo1(){
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.31.60",6379);

        //添加
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
