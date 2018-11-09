package br.com.hoiama.filtros;

import com.netflix.zuul.ZuulFilter;

public class PreFilter extends ZuulFilter {

    @Override
    public String filterType(){
        return "pre";
    }

    @Override
    public int filterOrder(){
        return 1;
    }

    @Override
    public boolean shouldFilter(){
        return true;
    }

    @Override
    public Object run(){
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println("Request Method:" + request.getMethod());
        System.out.println("Request URL:" + request.getRequestURL().toString());
        return null;
    }

}


