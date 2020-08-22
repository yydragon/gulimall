package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品库存
 * 
 * @author Yanyonglong
 * @email Yydragon@gmail.com
 * @date 2020-08-22 21:02:56
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
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
	private Long wareId;
	/**
	 * $column.comments
	 */
	private Integer stock;
	/**
	 * $column.comments
	 */
	private String skuName;
	/**
	 * $column.comments
	 */
	private Integer stockLocked;

}
