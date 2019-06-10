package com.example.info.service;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class QueryParamPreFilter extends ZuulFilter {

    /**
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        // 路由之前
        return "pre";
    }

    @Override
    public int filterOrder() {
        // 过滤的顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
        return null;
    }
}
