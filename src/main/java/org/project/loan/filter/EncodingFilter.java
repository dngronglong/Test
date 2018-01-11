package org.project.loan.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodingFilter implements Filter{
    private String encoding;
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String httpMethod = req.getMethod();//得到请求的提交方式
        if("GET".equals(httpMethod)){
            EncodingHttpServletRequest httpRequest = new EncodingHttpServletRequest(req, encoding);
            chain.doFilter(httpRequest, res);
        }else{
                request.setCharacterEncoding(encoding);
                response.setContentType("text/html;charset=" + encoding);
                chain.doFilter(request, response);

        }
    }

    public void destroy() {

    }
}
