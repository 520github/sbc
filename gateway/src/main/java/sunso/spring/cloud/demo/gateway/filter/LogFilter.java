package sunso.spring.cloud.demo.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title:LogFilter
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午9:29
 * @m444@126.com
 */

@Component
public class LogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //pre：路由之前
        //routing：路由之时
        //post： 路由之后
        //error：发送错误调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        String s = String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString());
        System.out.println("log filter-->" + s);
        return null;
    }
}
