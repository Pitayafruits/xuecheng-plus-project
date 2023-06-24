package com.xuecheng.content.model.dto;

import com.xuecheng.base.execption.ValidationGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * 添加课程dto
 */

@Data
@ApiModel(value="EditCourseDto", description="修改课程基本信息")
public class EditCourseDto  extends AddCourseDto {

    @ApiModelProperty(value = "课程id", required = true)
    private Long id;
}