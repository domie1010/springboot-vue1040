package com.entity.model;

import com.entity.YunshuzhuizongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 运输追踪
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class YunshuzhuizongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
