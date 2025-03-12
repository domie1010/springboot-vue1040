package com.entity.vo;

import com.entity.ShifeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 施肥
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class ShifeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果蔬图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 施肥
	 */
	
	private Integer shifei;
		
	/**
	 * 施肥时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shifeishijian;
				
	
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
	 * 设置：施肥
	 */
	 
	public void setShifei(Integer shifei) {
		this.shifei = shifei;
	}
	
	/**
	 * 获取：施肥
	 */
	public Integer getShifei() {
		return shifei;
	}
				
	
	/**
	 * 设置：施肥时间
	 */
	 
	public void setShifeishijian(Date shifeishijian) {
		this.shifeishijian = shifeishijian;
	}
	
	/**
	 * 获取：施肥时间
	 */
	public Date getShifeishijian() {
		return shifeishijian;
	}
			
}
