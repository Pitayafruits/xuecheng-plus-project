package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParms;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程信息编辑接口
 */
@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<CourseBase> list(PageParms pageParms, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return null;
    }
}
