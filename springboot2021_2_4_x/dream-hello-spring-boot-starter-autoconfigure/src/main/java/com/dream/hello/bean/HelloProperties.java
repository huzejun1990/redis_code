package com.dream.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName : HelloProperties
 * @Author : huzejun
 * @Date: 2021/5/2-18:46
 */

//@ConfigurationProperties("dream.hello")
@ConfigurationProperties("dream.hello")
public class HelloProperties {

/*    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }*/
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}
