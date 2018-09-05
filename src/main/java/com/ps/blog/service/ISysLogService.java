package com.ps.blog.service;

import com.ps.blog.entity.SysLog;
import com.ps.blog.entity.SysView;

import java.util.List;

/**
 * 日志/访问统计
 * @author ps
 * @date 2018-08-29
 * @time 17:18
 */
public interface ISysLogService {

    void addLog(SysLog sysLog);

    void addView(SysView sysView);

    List<SysLog> listAllLog();

    List<SysView> ListAllView();

}
