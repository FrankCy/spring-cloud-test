import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-cloud-test
 * @package: PACKAGE_NAME
 * @email: cy880708@163.com
 * @date: 2018/6/8 下午5:08
 * @mofified By:
 */
@SpringBootApplication()
@EnableEurekaServer
public class EurekaServerStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class, args);
    }
}
