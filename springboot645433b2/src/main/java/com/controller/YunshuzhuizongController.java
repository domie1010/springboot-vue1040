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

import com.entity.YunshuzhuizongEntity;
import com.entity.view.YunshuzhuizongView;

import com.service.YunshuzhuizongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 运输追踪
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@RestController
@RequestMapping("/yunshuzhuizong")
public class YunshuzhuizongController {
    @Autowired
    private YunshuzhuizongService yunshuzhuizongService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YunshuzhuizongEntity yunshuzhuizong,
		HttpServletRequest request){
        EntityWrapper<YunshuzhuizongEntity> ew = new EntityWrapper<YunshuzhuizongEntity>();

		PageUtils page = yunshuzhuizongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yunshuzhuizong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YunshuzhuizongEntity yunshuzhuizong, 
		HttpServletRequest request){
        EntityWrapper<YunshuzhuizongEntity> ew = new EntityWrapper<YunshuzhuizongEntity>();

		PageUtils page = yunshuzhuizongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yunshuzhuizong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YunshuzhuizongEntity yunshuzhuizong){
       	EntityWrapper<YunshuzhuizongEntity> ew = new EntityWrapper<YunshuzhuizongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yunshuzhuizong, "yunshuzhuizong")); 
        return R.ok().put("data", yunshuzhuizongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YunshuzhuizongEntity yunshuzhuizong){
        EntityWrapper< YunshuzhuizongEntity> ew = new EntityWrapper< YunshuzhuizongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yunshuzhuizong, "yunshuzhuizong")); 
		YunshuzhuizongView yunshuzhuizongView =  yunshuzhuizongService.selectView(ew);
		return R.ok("查询运输追踪成功").put("data", yunshuzhuizongView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YunshuzhuizongEntity yunshuzhuizong = yunshuzhuizongService.selectById(id);
        return R.ok().put("data", yunshuzhuizong);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YunshuzhuizongEntity yunshuzhuizong = yunshuzhuizongService.selectById(id);
        return R.ok().put("data", yunshuzhuizong);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YunshuzhuizongEntity yunshuzhuizong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yunshuzhuizong);
        yunshuzhuizongService.insert(yunshuzhuizong);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YunshuzhuizongEntity yunshuzhuizong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yunshuzhuizong);
        yunshuzhuizongService.insert(yunshuzhuizong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YunshuzhuizongEntity yunshuzhuizong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yunshuzhuizong);
        yunshuzhuizongService.updateById(yunshuzhuizong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yunshuzhuizongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
