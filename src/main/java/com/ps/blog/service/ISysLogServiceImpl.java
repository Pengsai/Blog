package com.ps.blog.service;

import com.ps.blog.dao.SysLogMapper;
import com.ps.blog.dao.SysViewMapper;
import com.ps.blog.entity.SysLog;
import com.ps.blog.entity.SysLogExample;
import com.ps.blog.entity.SysView;
import com.ps.blog.entity.SysViewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *@ClassName ISysLogServiceImpl
 *@Description TODO
 *@Author PS
 *@Date 2018/8/29 17:20
 **/
@Service
public class ISysLogServiceImpl implements ISysLogService{


    @Autowired
    private SysLogMapper sysLogMapper;

    @Autowired
    private SysViewMapper sysViewMapper;

    @Override
    public void addLog(SysLog sysLog) {
        sysLog.setCreateDt(new Date());
        sysLogMapper.insertSelective(sysLog);
    }

    @Override
    public void addView(SysView sysView) {
        sysView.setCreateDt(new Date());
        sysViewMapper.insertSelective(sysView);
    }

    @Override
    public List<SysLog> listAllLog() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example);
    }

    @Override
    public List<SysView> ListAllView() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example);
    }
}
