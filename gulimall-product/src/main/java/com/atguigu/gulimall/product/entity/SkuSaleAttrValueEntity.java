package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku销售属性&值
 * 
 * @author Yanyonglong
 * @email Yydragon@gmail.com
 * @date 2020-08-22 18:00:27
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private Long attrId;
	/**
	 * $column.comments
	 */
	private String attrName;
	/**
	 * $column.comments
	 */
	private String attrValue;
	/**
	 * $column.comments
	 */
	private Integer attrSort;

}
