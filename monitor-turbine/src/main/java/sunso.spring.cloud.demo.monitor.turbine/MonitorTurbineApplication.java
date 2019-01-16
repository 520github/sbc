package sunso.spring.cloud.demo.monitor.turbine;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

/**
 * @Title:MonitorTurbineApplication
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午4:27
 * @m444@126.com
 */

@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class MonitorTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorTurbineApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
