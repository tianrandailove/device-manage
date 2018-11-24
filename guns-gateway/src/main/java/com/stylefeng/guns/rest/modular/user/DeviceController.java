/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.stylefeng.guns.rest.modular.user;

import com.stylefeng.guns.api.device.DeviceServiceApi;
import com.stylefeng.guns.api.device.vo.DeviceVo;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 17262
 * @version V1.0
 * @since 2018-11-23 22:03
 */
@RestController
@RequestMapping("/device/")
public class DeviceController {

    @Autowired
    private DeviceServiceApi deviceServiceApi;

    @PostMapping("get")
    public ResponseVO getDeviceByNo(String enterpriseNo){
        DeviceVo deviceByEnterpriseNo = deviceServiceApi.getDeviceByEnterpriseNo(enterpriseNo);
        return ResponseVO.success(deviceByEnterpriseNo);
    }
}