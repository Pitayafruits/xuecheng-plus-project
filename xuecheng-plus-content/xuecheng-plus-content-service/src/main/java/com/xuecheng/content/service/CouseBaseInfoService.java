package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParms;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * 课程基本信息管理接口
 */
public interface CouseBaseInfoService {

    //课程查询接口
    PageResult<CourseBase> queryCourseBaseList(PageParms pageParms,QueryCourseParamsDto queryCourseParamsDto);

    //添加课程基本信息接口
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}
