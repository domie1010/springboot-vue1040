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
 * 采摘
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@TableName("caizhai")
public class CaizhaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaizhaiEntity() {
		
	}
	
	public CaizhaiEntity(T t) {
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
	 * 采摘数量
	 */
					
	private Integer zhongzhishuliang;
	
	/**
	 * 采摘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date caizhaishijian;
	
	
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
