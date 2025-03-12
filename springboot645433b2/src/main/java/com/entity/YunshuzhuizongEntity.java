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
 * 运输追踪
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@TableName("yunshuzhuizong")
public class YunshuzhuizongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YunshuzhuizongEntity() {
		
	}
	
	public YunshuzhuizongEntity(T t) {
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
	 * 生产地点
	 */
					
	private String shengchandidian;
	
	/**
	 * 销售地点
	 */
					
	private String xiaoshoudidian;
	
	/**
	 * 运输过程
	 */
					
	private String yunshuguocheng;
	
	/**
	 * 运输时间
	 */
					
	private String yunshushijian;
	
	/**
	 * 运输方式
	 */
					
	private String yunshufangshi;
	
	/**
	 * 经手人
	 */
					
	private String jingshouren;
	
	/**
	 * 运输时长
	 */
					
	private String yunshushizhang;
	
	/**
	 * 路线图
	 */
					
	private String luxiantu;
	
	
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
	 * 设置：销售地点
	 */
	public void setXiaoshoudidian(String xiaoshoudidian) {
		this.xiaoshoudidian = xiaoshoudidian;
	}
	/**
	 * 获取：销售地点
	 */
	public String getXiaoshoudidian() {
		return xiaoshoudidian;
	}
	/**
	 * 设置：运输过程
	 */
	public void setYunshuguocheng(String yunshuguocheng) {
		this.yunshuguocheng = yunshuguocheng;
	}
	/**
	 * 获取：运输过程
	 */
	public String getYunshuguocheng() {
		return yunshuguocheng;
	}
	/**
	 * 设置：运输时间
	 */
	public void setYunshushijian(String yunshushijian) {
		this.yunshushijian = yunshushijian;
	}
	/**
	 * 获取：运输时间
	 */
	public String getYunshushijian() {
		return yunshushijian;
	}
	/**
	 * 设置：运输方式
	 */
	public void setYunshufangshi(String yunshufangshi) {
		this.yunshufangshi = yunshufangshi;
	}
	/**
	 * 获取：运输方式
	 */
	public String getYunshufangshi() {
		return yunshufangshi;
	}
	/**
	 * 设置：经手人
	 */
	public void setJingshouren(String jingshouren) {
		this.jingshouren = jingshouren;
	}
	/**
	 * 获取：经手人
	 */
	public String getJingshouren() {
		return jingshouren;
	}
	/**
	 * 设置：运输时长
	 */
	public void setYunshushizhang(String yunshushizhang) {
		this.yunshushizhang = yunshushizhang;
	}
	/**
	 * 获取：运输时长
	 */
	public String getYunshushizhang() {
		return yunshushizhang;
	}
	/**
	 * 设置：路线图
	 */
	public void setLuxiantu(String luxiantu) {
		this.luxiantu = luxiantu;
	}
	/**
	 * 获取：路线图
	 */
	public String getLuxiantu() {
		return luxiantu;
	}

}
