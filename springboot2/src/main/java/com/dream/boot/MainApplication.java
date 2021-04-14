package com.dream.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.cache.interceptor.CacheAspectSupport;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: huzejun
 * @Date: 2021/3/19 22:36
 */

/**
 * 主程序类
 *  @SpringBootApplication：这是一个springboot应用
 */
//@SpringBootApplication(scanBasePackages = "com.dream")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.dream.boot")
public class MainApplication {

    private String[] beanNamesForType;

    public static void main(String[] args) {

        //1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);

        String[] beanNamesForType = run.getBeanNamesForType(CacheAspectSupport.class);
        System.out.println("=============="+beanNamesForType.length);

        //3,从容器中获取组件

        String[] beanNamesForType1 = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println("=========="+beanNamesForType1.length);

 /*       Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件："+(tom01 == tom02));

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot总会检查这个组件是否在容器中用
        // 保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("用户的宠物："+(user01.getPet() == tom));

        //5.获取组件

        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("==============");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        DBHelper dbHelper = run.getBean(DBHelper.class);
        System.out.println(dbHelper);
*/

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件：" + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件： "+ user01);


        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件：" + tom22);

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");

        System.out.println("haha: " + haha);
        System.out.println("hehe: " + hehe);

    }
}
