package com.debug.steadyjack.controller;

import com.debug.steadyjack.entity.OrderRecord;
import com.debug.steadyjack.mapper.OrderRecordMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/9/14.
 */
@Controller
public class OrderRecordPageController {

    private static final Logger log= LoggerFactory.getLogger(OrderRecordController.class);

    private static final String prefix="order/record/page";

    @Autowired
    private OrderRecordMapper orderRecordMapper;


    @RequestMapping(value = prefix+"/index",method = RequestMethod.GET)
    public String index(){
        return "orderRecord";
    }

    /**
     * 请求塞入模型实体对象数据
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = prefix+"/index/v2",method = RequestMethod.GET)
    public String indexV2(Integer id, ModelMap modelMap){
        OrderRecord record=orderRecordMapper.selectByPrimaryKey(id);
        modelMap.addAttribute("record",record);
        return "orderRecord";
    }




}




















