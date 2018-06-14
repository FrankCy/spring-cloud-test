package com.eureka.discovery.provider;

import com.eureka.discovery.bean.Test;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-cloud-test
 * @package: com.eureka.discovery.provider
 * @email: cy880708@163.com
 * @date: 2018/6/14 下午2:39
 * @mofified By:
 */
@RestController
public class TestProvider {

    @RequestMapping(value = "/call/{id}",
    method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Test getTest() {
        Test test = new Test();
        test.setId(1);
        test.setInfo("测试信息");
        return test;
    }


}
