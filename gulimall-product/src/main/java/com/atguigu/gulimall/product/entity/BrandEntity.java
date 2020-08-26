package com.atguigu.gulimall.product.entity;

import com.atguigu.common.utils.valid.AddGroup;
import com.atguigu.common.utils.valid.ListValue;
import com.atguigu.common.utils.valid.UpdateGroup;
import com.atguigu.common.utils.valid.UpdateStatusGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author Yanyonglong
 * @email Yydragon@gmail.com
 * @date 2020-08-22 18:00:27
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@javax.validation.constraints.NotNull(message = "修改必须指定id",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定id",groups = {AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * $column.comments
	 */
	@NotBlank(message = "品牌名必须提交",groups = {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * $column.comments
	 */
	@NotEmpty
	private String logo;
	/**
	 * $column.comments
	 */
	private String descript;
	/**
	 * $column.comments
	 */
	@javax.validation.constraints.NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
	@ListValue(vals = {0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * $column.comments
	 */
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字符必须是一个首字母")
	private String firstLetter;
	/**
	 * $column.comments
	 */
	@NotNull
	@Min(value = 0,message = "排序必须大于等于0")
	private Integer sort;

}
