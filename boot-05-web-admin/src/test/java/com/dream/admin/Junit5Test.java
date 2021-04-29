package com.dream.admin;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName : Junit5Test
 * @Author : huzejun
 * @Date: 2021/4/28-22:39
 * @Description :
 */

/**
 * @BootstrapWith(SpringBootTestContextBootstrapper.class)
 * @ExtendWith(SpringExtension.class)
 */
//@SpringBootTest
@DisplayName("junit5功能测试")
public class Junit5Test {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 测试前置条件
     */
    @DisplayName("测试前置条件")
    @Test
    void testassumptions(){
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("11111111");
    }

    /**
     * 断言，前面的断言失败，后面的代码都不会执行
     */
    @DisplayName("测试简单断言")
    @Test
    void testSimpleAssertions(){
        int cal = cal(2, 3);
        assertEquals(6,cal,"业务逻辑计算失败！");
        Object obj1 = new Object();
        Object obj2 = new Object();
//        assertEquals(obj1,obj2);
        assertSame(obj1,obj2,"两个对象不一样");
    }

    @Test
    @DisplayName("array assertion")
    void array(){
        assertArrayEquals(new int[]{2,1},new int []{1,2});
    }

    @Test
    @DisplayName("组合断言")
    void all(){
        assertAll("test",
                ()-> assertTrue(true && true,"结果不为true"),
                ()-> assertEquals(1,2,"结果不是1"));

        System.out.println("=================");
    }

    @DisplayName("异常断言")
    @Test
    void testException(){

        //断定业务逻辑一定出现异常
        assertThrows(ArithmeticException.class,()->{
            int i=10/2;
        },"业务逻辑正常运行");

    }

    @DisplayName("快速失败")
    @Test
    void testFail(){
        //xxx
        if (1 == 2){
            fail("测试失败");
        }
    }

    int cal(int i,int j){
        return i+j;
    }

    @DisplayName("测试displayName注解")
    @Test
    void testDisplayName(){
        System.out.println(1);
        System.out.println(jdbcTemplate);
    }

    @Disabled
    @DisplayName("测试方法2")
    @Test
    void test2(){
        System.out.println(2);
    }

    @RepeatedTest(5)
    @Test
    void test3(){
        System.out.println(5);
    }

    /**
     * 规定方法超出时间，超出时间测试出异常
     * @throws InterruptedException
     */
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    @Test
    void testTimeOut() throws InterruptedException {
        Thread.sleep(200);
    }

    @BeforeEach
    void testBeforeEach(){
        System.out.println("测试就要开始了。。。");
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("测试结束了。。。");
    }

    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有测试就要开始了。。。");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("所有测试已经结束了");
    }

}
