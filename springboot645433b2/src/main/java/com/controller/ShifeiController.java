package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShifeiEntity;
import com.entity.view.ShifeiView;

import com.service.ShifeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 施肥
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@RestController
@RequestMapping("/shifei")
public class ShifeiController {
    @Autowired
    private ShifeiService shifeiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShifeiEntity shifei,
		HttpServletRequest request){
        EntityWrapper<ShifeiEntity> ew = new EntityWrapper<ShifeiEntity>();

		PageUtils page = shifeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shifei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShifeiEntity shifei, 
		HttpServletRequest request){
        EntityWrapper<ShifeiEntity> ew = new EntityWrapper<ShifeiEntity>();

		PageUtils page = shifeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shifei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShifeiEntity shifei){
       	EntityWrapper<ShifeiEntity> ew = new EntityWrapper<ShifeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shifei, "shifei")); 
        return R.ok().put("data", shifeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShifeiEntity shifei){
        EntityWrapper< ShifeiEntity> ew = new EntityWrapper< ShifeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shifei, "shifei")); 
		ShifeiView shifeiView =  shifeiService.selectView(ew);
		return R.ok("查询施肥成功").put("data", shifeiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShifeiEntity shifei = shifeiService.selectById(id);
        return R.ok().put("data", shifei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShifeiEntity shifei = shifeiService.selectById(id);
        return R.ok().put("data", shifei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShifeiEntity shifei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shifei);
        shifeiService.insert(shifei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShifeiEntity shifei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shifei);
        shifeiService.insert(shifei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShifeiEntity shifei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shifei);
        shifeiService.updateById(shifei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shifeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
