package com.entity.vo;

import com.entity.CaizhaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 采摘
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class CaizhaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果蔬图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 采摘数量
	 */
	
	private Integer zhongzhishuliang;
		
	/**
	 * 采摘时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caizhaishijian;
				
	
	/**
	 * 设置：果蔬图片
	 */
	 
	public void setGuoshutupian(String guoshutupian) {
		this.guoshutupian = guoshutupian;
	}
	
	/**
	 * 获取：果蔬图片
	 */
	public String getGuoshutupian() {
		return guoshutupian;
	}
				
	
	/**
	 * 设置：采摘数量
	 */
	 
	public void setZhongzhishuliang(Integer zhongzhishuliang) {
		this.zhongzhishuliang = zhongzhishuliang;
	}
	
	/**
	 * 获取：采摘数量
	 */
	public Integer getZhongzhishuliang() {
		return zhongzhishuliang;
	}
				
	
	/**
	 * 设置：采摘时间
	 */
	 
	public void setCaizhaishijian(Date caizhaishijian) {
		this.caizhaishijian = caizhaishijian;
	}
	
	/**
	 * 获取：采摘时间
	 */
	public Date getCaizhaishijian() {
		return caizhaishijian;
	}
			
}
