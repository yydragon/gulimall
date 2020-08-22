package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收藏的商品
 * 
 * @author Yanyonglong
 * @email Yydragon@gmail.com
 * @date 2020-08-22 20:45:31
 */
@Data
@TableName("ums_member_collect_spu")
public class MemberCollectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long memberId;
	/**
	 * $column.comments
	 */
	private Long spuId;
	/**
	 * $column.comments
	 */
	private String spuName;
	/**
	 * $column.comments
	 */
	private String spuImg;
	/**
	 * $column.comments
	 */
	private Date createTime;

}
