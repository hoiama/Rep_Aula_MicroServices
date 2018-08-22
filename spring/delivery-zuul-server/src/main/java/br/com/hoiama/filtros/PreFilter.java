package br.com.hoiama.filtros;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class PreFilter extends ZuulFilter {

    /**
     * Pode retornar 4 strings "pre/post/route/error"
     * @return
     */
    @Override
    public String filterType(){
        System.out.println("PreFilter :: filterType");
        return "pre";
    }

    @Override
    public int filterOrder(){
        System.out.println("PreFilter :: filterOrder");
        return 1;
    }


    @Override
    public boolean shouldFilter(){
        System.out.println("PreFilter :: shouldFilter");
        return true;
    }

    @Override
    public Object run(){
        System.out.println("PreFilter :: run");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
        return null;
    }

}


