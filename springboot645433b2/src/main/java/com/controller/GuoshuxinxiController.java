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

import com.entity.GuoshuxinxiEntity;
import com.entity.view.GuoshuxinxiView;

import com.service.GuoshuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 果蔬信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@RestController
@RequestMapping("/guoshuxinxi")
public class GuoshuxinxiController {
    @Autowired
    private GuoshuxinxiService guoshuxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuoshuxinxiEntity guoshuxinxi,
		HttpServletRequest request){
        EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();

		PageUtils page = guoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuoshuxinxiEntity guoshuxinxi, 
		HttpServletRequest request){
        EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();

		PageUtils page = guoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshuxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuoshuxinxiEntity guoshuxinxi){
       	EntityWrapper<GuoshuxinxiEntity> ew = new EntityWrapper<GuoshuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guoshuxinxi, "guoshuxinxi")); 
        return R.ok().put("data", guoshuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuoshuxinxiEntity guoshuxinxi){
        EntityWrapper< GuoshuxinxiEntity> ew = new EntityWrapper< GuoshuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guoshuxinxi, "guoshuxinxi")); 
		GuoshuxinxiView guoshuxinxiView =  guoshuxinxiService.selectView(ew);
		return R.ok("查询果蔬信息成功").put("data", guoshuxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuoshuxinxiEntity guoshuxinxi = guoshuxinxiService.selectById(id);
        return R.ok().put("data", guoshuxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuoshuxinxiEntity guoshuxinxi = guoshuxinxiService.selectById(id);
        return R.ok().put("data", guoshuxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuxinxi);
        guoshuxinxiService.insert(guoshuxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshuxinxi);
        guoshuxinxiService.insert(guoshuxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuoshuxinxiEntity guoshuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guoshuxinxi);
        guoshuxinxiService.updateById(guoshuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guoshuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
