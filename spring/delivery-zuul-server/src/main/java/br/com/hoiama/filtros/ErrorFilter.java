package br.com.hoiama.filtros;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter {

    @Override
    public String filterType() {
        System.out.println("ErrorFilter :: filterType");
        return "error";
    }

    @Override
    public int filterOrder() {
        System.out.println("ErrorFilter :: filterOrder");
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("ErroFilter :: shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("ErroFilter :: run");
        return null;
    }
}
