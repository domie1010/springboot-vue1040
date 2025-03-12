package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 果蔬生产地
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@TableName("guoshushengchandi")
public class GuoshushengchandiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuoshushengchandiEntity() {
		
	}
	
	public GuoshushengchandiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 果蔬名称
	 */
					
	private String guoshumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：果蔬名称
	 */
	public void setGuoshumingcheng(String guoshumingcheng) {
		this.guoshumingcheng = guoshumingcheng;
	}
	/**
	 * 获取：果蔬名称
	 */
	public String getGuoshumingcheng() {
		return guoshumingcheng;
	}
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
