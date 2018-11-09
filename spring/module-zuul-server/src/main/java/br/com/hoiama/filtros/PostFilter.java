package br.com.hoiama.filtros;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        System.out.println("PostFilter :: filterType");
        return "post";
    }

    @Override
    public int filterOrder() {
        System.out.println("PostFilter :: filterOrder");
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("PostFilter :: shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("PostFilter :: run");
        return null;
    }
}
