package com.aqemachinery.erp.web.controller;

import com.aqemachinery.erp.common.Result;
import com.aqemachinery.erp.common.ResultUtil;
import com.aqemachinery.erp.web.vo.CustomerVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/list/{pageIndex}/{pageSize}")
    @ResponseBody
    public Result<List<CustomerVO>> list(@RequestParam Integer pageIndex, @RequestParam Integer pageSize) {
        try {
            List<CustomerVO> customerVOs = new LinkedList<>();
            return ResultUtil.success(customerVOs);
        } catch (Exception e) {
            return ResultUtil.error(e.getMessage());
        }
    }
}
