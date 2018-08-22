package br.com.hoiama.filtros;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter {

    @Override
    public String filterType() {
        System.out.println("RouterFilter :: filterType");
        return "route";
    }

    @Override
    public int filterOrder() {
        System.out.println("RouteFilter :: filterOrder");
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("RouteFilter :: shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("RouteFilter :: run");
        return null;
    }
}
