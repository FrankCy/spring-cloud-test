package com.ek.ct.discovery.bean;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-cloud-test
 * @package: com.eureka.discovery.bean
 * @email: cy880708@163.com
 * @date: 2018/6/14 下午2:38
 * @mofified By:
 */
public class Test {

    private Integer id;

    private String info;

    private String httpAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getHttpAddress() {
        return httpAddress;
    }

    public void setHttpAddress(String httpAddress) {
        this.httpAddress = httpAddress;
    }
}
