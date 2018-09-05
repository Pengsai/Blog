package com.ps.blog.controller;

import com.ps.blog.entity.SortInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName SortController
 *@Description TODO
 *@Author PS
 *@Date 2018/8/29 16:18
 **/
@RestController
@RequestMapping("/api/sort")
public class SortController {

    /**
     * 获取所有分类信息
     *
     * @return
     */
    @ApiOperation("获取所有分类信息")
    @GetMapping("/list")
    public List<SortInfo> listAllSortInfo() {
        return null;
    }

    /**
     * 通过id获取一条分类信息
     *
     * @param id
     * @return
     */
    @ApiOperation("获取某一条分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public SortInfo getSortInfoById(@PathVariable Long id) {
        return null;
    }

    /**
     * 增加一条分类信息数据
     *
     * @return
     */
    @ApiOperation("增加分类信息")
    @ApiImplicitParam(name = "name", value = "分类名称", required = true, dataType = "String")
    @PostMapping("")
    public String addSortInfo() {
        return null;
    }

    /**
     * 更新/编辑一条数据
     *
     * @param id
     * @return
     */
    @ApiOperation("更新/编辑分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @PutMapping("/{id}")
    public String updateSortInfo(@PathVariable Long id) {
        return null;
    }

    /**
     * 根据ID删除分类信息
     *
     * @param id
     * @return
     */
    @ApiOperation("删除分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @DeleteMapping("/{id}")
    public String deleteSortInfo(@PathVariable Long id) {
        return null;
    }

}