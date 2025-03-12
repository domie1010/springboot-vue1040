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

import com.entity.GuoshushengchandiEntity;
import com.entity.view.GuoshushengchandiView;

import com.service.GuoshushengchandiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 果蔬生产地
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-18 14:01:18
 */
@RestController
@RequestMapping("/guoshushengchandi")
public class GuoshushengchandiController {
    @Autowired
    private GuoshushengchandiService guoshushengchandiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuoshushengchandiEntity guoshushengchandi,
		HttpServletRequest request){
        EntityWrapper<GuoshushengchandiEntity> ew = new EntityWrapper<GuoshushengchandiEntity>();

		PageUtils page = guoshushengchandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshushengchandi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuoshushengchandiEntity guoshushengchandi, 
		HttpServletRequest request){
        EntityWrapper<GuoshushengchandiEntity> ew = new EntityWrapper<GuoshushengchandiEntity>();

		PageUtils page = guoshushengchandiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guoshushengchandi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuoshushengchandiEntity guoshushengchandi){
       	EntityWrapper<GuoshushengchandiEntity> ew = new EntityWrapper<GuoshushengchandiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guoshushengchandi, "guoshushengchandi")); 
        return R.ok().put("data", guoshushengchandiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuoshushengchandiEntity guoshushengchandi){
        EntityWrapper< GuoshushengchandiEntity> ew = new EntityWrapper< GuoshushengchandiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guoshushengchandi, "guoshushengchandi")); 
		GuoshushengchandiView guoshushengchandiView =  guoshushengchandiService.selectView(ew);
		return R.ok("查询果蔬生产地成功").put("data", guoshushengchandiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuoshushengchandiEntity guoshushengchandi = guoshushengchandiService.selectById(id);
        return R.ok().put("data", guoshushengchandi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuoshushengchandiEntity guoshushengchandi = guoshushengchandiService.selectById(id);
        return R.ok().put("data", guoshushengchandi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuoshushengchandiEntity guoshushengchandi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshushengchandi);
        guoshushengchandiService.insert(guoshushengchandi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuoshushengchandiEntity guoshushengchandi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guoshushengchandi);
        guoshushengchandiService.insert(guoshushengchandi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuoshushengchandiEntity guoshushengchandi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guoshushengchandi);
        guoshushengchandiService.updateById(guoshushengchandi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guoshushengchandiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
