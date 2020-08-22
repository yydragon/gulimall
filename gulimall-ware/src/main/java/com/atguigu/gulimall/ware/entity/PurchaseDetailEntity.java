package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author Yanyonglong
 * @email Yydragon@gmail.com
 * @date 2020-08-22 21:02:56
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long purchaseId;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private Integer skuNum;
	/**
	 * $column.comments
	 */
	private BigDecimal skuPrice;
	/**
	 * $column.comments
	 */
	private Long wareId;
	/**
	 * $column.comments
	 */
	private Integer status;

}
