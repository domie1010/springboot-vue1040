package com.entity.vo;

import com.entity.GuoshushengchandiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 果蔬生产地
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class GuoshushengchandiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果蔬图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 生产地点
	 */
	
	private String shengchandidian;
		
	/**
	 * 土壤情况
	 */
	
	private String turangqingkuang;
		
	/**
	 * 地理位置
	 */
	
	private String diliweizhi;
		
	/**
	 * 水资源
	 */
	
	private String shuiziyuan;
		
	/**
	 * 气候条件
	 */
	
	private String qihoutiaojian;
				
	
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
	 * 设置：生产地点
	 */
	 
	public void setShengchandidian(String shengchandidian) {
		this.shengchandidian = shengchandidian;
	}
	
	/**
	 * 获取：生产地点
	 */
	public String getShengchandidian() {
		return shengchandidian;
	}
				
	
	/**
	 * 设置：土壤情况
	 */
	 
	public void setTurangqingkuang(String turangqingkuang) {
		this.turangqingkuang = turangqingkuang;
	}
	
	/**
	 * 获取：土壤情况
	 */
	public String getTurangqingkuang() {
		return turangqingkuang;
	}
				
	
	/**
	 * 设置：地理位置
	 */
	 
	public void setDiliweizhi(String diliweizhi) {
		this.diliweizhi = diliweizhi;
	}
	
	/**
	 * 获取：地理位置
	 */
	public String getDiliweizhi() {
		return diliweizhi;
	}
				
	
	/**
	 * 设置：水资源
	 */
	 
	public void setShuiziyuan(String shuiziyuan) {
		this.shuiziyuan = shuiziyuan;
	}
	
	/**
	 * 获取：水资源
	 */
	public String getShuiziyuan() {
		return shuiziyuan;
	}
				
	
	/**
	 * 设置：气候条件
	 */
	 
	public void setQihoutiaojian(String qihoutiaojian) {
		this.qihoutiaojian = qihoutiaojian;
	}
	
	/**
	 * 获取：气候条件
	 */
	public String getQihoutiaojian() {
		return qihoutiaojian;
	}
			
}
