package com.ps.blog.interceptor;

import com.ps.blog.entity.SysLog;
import com.ps.blog.entity.SysView;
import com.ps.blog.service.ISysLogService;
import com.ps.blog.until.BrowserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 *@ClassName ForeInterceptor
 *@Description 前台拦截器:用于对访问数量进行统计
 *@Author PS
 *@Date 2018/8/29 17:06
 **/
public class ForeInterceptor implements HandlerInterceptor {

    @Autowired
    private ISysLogService iSysLogService;

    private SysLog sysLog = new SysLog();

    private SysView sysView = new SysView();


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ip = request.getRemoteAddr();

        String url = request.getRequestURL().toString();

        String browserInfo = BrowserUtil.getOsAndBrowserInfo(request);

        // ISysLogService 日志
        sysLog.setIp(StringUtils.isEmpty(ip) ? "0.0.0.0" : ip);
        sysLog.setOperateBy(StringUtils.isEmpty(browserInfo)? "获取浏览器失败" : browserInfo);
        sysLog.setOperateUrl(StringUtils.isEmpty(url)? "获取url失败" : url);
        iSysLogService.addLog(sysLog);
        // SysView 访问量

        sysView.setIp(StringUtils.isEmpty(ip) ? "0.0.0.0" : ip);
        iSysLogService.addView(sysView);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        /*HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        // 保存日志信息
        sysLog.setRemark(method.getName());
        iSysLogService.addLog(sysLog);*/

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            // 保存日志信息
            sysLog.setRemark(method.getName());
            iSysLogService.addLog(sysLog);

        } else {
            String uri = request.getRequestURI();
            sysLog.setRemark(uri);
            iSysLogService.addLog(sysLog);
        }


    }


}
