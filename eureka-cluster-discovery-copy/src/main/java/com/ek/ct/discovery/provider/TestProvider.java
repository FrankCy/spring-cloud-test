package com.ek.ct.discovery.provider;

import com.ek.ct.discovery.bean.Test;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    public Test getTest(@PathVariable Integer id, HttpServletRequest httpServletRequest) {
        Test test = new Test();
        test.setId(id);
        test.setInfo("测试信息 Provider Copy");
        test.setHttpAddress(httpServletRequest.getRequestURL().toString());
        return test;
    }


}
