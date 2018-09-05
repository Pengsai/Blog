package com.ps.blog.dao;

import com.ps.blog.entity.SysView;
import com.ps.blog.entity.SysViewExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysViewMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);

    SysView selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysView record);

    int updateByPrimaryKey(SysView record);
}