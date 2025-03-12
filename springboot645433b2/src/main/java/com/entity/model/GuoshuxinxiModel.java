package com.entity.model;

import com.entity.GuoshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 果蔬信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
public class GuoshuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 果蔬类型
	 */
	
	private String guoshuleixing;
		
	/**
	 * 果蔬图片
	 */
	
	private String guoshutupian;
		
	/**
	 * 生长阶段
	 */
	
	private String shengzhangjieduan;
		
	/**
	 * 种植数量
	 */
	
	private Integer zhongzhishuliang;
		
	/**
	 * 病虫害防治
	 */
	
	private String bingchonghaifangzhi;
		
	/**
	 * 施肥
	 */
	
	private Integer shifei;
		
	/**
	 * 灌溉浇水
	 */
	
	private Integer guangaijiaoshui;
		
	/**
	 * 播种时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bozhongshijian;
		
	/**
	 * 果蔬场地
	 */
	
	private String guoshuchangdi;
		
	/**
	 * 运输方式
	 */
	
	private String yunshufangshi;
		
	/**
	 * 运输时间
	 */
	
	private String yunshushijian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
				
	
	/**
	 * 设置：果蔬类型
	 */
	 
	public void setGuoshuleixing(String guoshuleixing) {
		this.guoshuleixing = guoshuleixing;
	}
	
	/**
	 * 获取：果蔬类型
	 */
	public String getGuoshuleixing() {
		return guoshuleixing;
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
	 * 设置：生长阶段
	 */
	 
	public void setShengzhangjieduan(String shengzhangjieduan) {
		this.shengzhangjieduan = shengzhangjieduan;
	}
	
	/**
	 * 获取：生长阶段
	 */
	public String getShengzhangjieduan() {
		return shengzhangjieduan;
	}
				
	
	/**
	 * 设置：种植数量
	 */
	 
	public void setZhongzhishuliang(Integer zhongzhishuliang) {
		this.zhongzhishuliang = zhongzhishuliang;
	}
	
	/**
	 * 获取：种植数量
	 */
	public Integer getZhongzhishuliang() {
		return zhongzhishuliang;
	}
				
	
	/**
	 * 设置：病虫害防治
	 */
	 
	public void setBingchonghaifangzhi(String bingchonghaifangzhi) {
		this.bingchonghaifangzhi = bingchonghaifangzhi;
	}
	
	/**
	 * 获取：病虫害防治
	 */
	public String getBingchonghaifangzhi() {
		return bingchonghaifangzhi;
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
	 * 设置：灌溉浇水
	 */
	 
	public void setGuangaijiaoshui(Integer guangaijiaoshui) {
		this.guangaijiaoshui = guangaijiaoshui;
	}
	
	/**
	 * 获取：灌溉浇水
	 */
	public Integer getGuangaijiaoshui() {
		return guangaijiaoshui;
	}
				
	
	/**
	 * 设置：播种时间
	 */
	 
	public void setBozhongshijian(Date bozhongshijian) {
		this.bozhongshijian = bozhongshijian;
	}
	
	/**
	 * 获取：播种时间
	 */
	public Date getBozhongshijian() {
		return bozhongshijian;
	}
				
	
	/**
	 * 设置：果蔬场地
	 */
	 
	public void setGuoshuchangdi(String guoshuchangdi) {
		this.guoshuchangdi = guoshuchangdi;
	}
	
	/**
	 * 获取：果蔬场地
	 */
	public String getGuoshuchangdi() {
		return guoshuchangdi;
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
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
			
}
