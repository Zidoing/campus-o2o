package com.imooc.o2o.web.superadmin;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhoulei
 * Date: 15/09/2018
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {

    Logger logger = LoggerFactory.getLogger(AreaController.class);

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @ResponseBody
    private Map <String, Object> listArea() {
        logger.info("start");
        long startTime = System.currentTimeMillis();
        Map <String, Object> modelMap = new HashMap <>();
        List <Area> list = new ArrayList <>();

        try {
            list = areaService.getAreaList();
            modelMap.put("rows", list);
            modelMap.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("errMsg", e.toString());
        }
        long endTime = System.currentTimeMillis();
        logger.debug("cosTime:[{}ms", endTime - startTime);
        logger.info("ending");

        return modelMap;

    }
}