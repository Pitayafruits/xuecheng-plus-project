package com.xuecheng;

import com.xuecheng.base.model.PageParms;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CouseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseBaseInfoServiceTests {

    @Autowired
    private CouseBaseInfoService couseBaseInfoService;

    @Test
     public void testCourseBaseInfoService(){
        //查询条件
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("java");
        queryCourseParamsDto.setAuditStatus("202004");
        queryCourseParamsDto.setPublishStatus("203001");
        //分页参数
        PageParms pageParms = new PageParms();
        pageParms.setPageNo(1L); //页码
        pageParms.setPageSize(3L); //每页记录数

        PageResult<CourseBase> courseBasePageResult = couseBaseInfoService.queryCourseBaseList(pageParms,queryCourseParamsDto);
        System.out.println(courseBasePageResult);
    }
}
