package com.example.controller;

import com.example.base.BaseVO;
import com.example.controller.vo.SubReqVO;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 李文龙
 * @create: 2019-07-25 17:38
 * @description:
 **/
@RestController
@RequestMapping("api/common")
public class CommonController {

    @PostMapping("sub")
    public BaseVO<String> sub(@RequestBody SubReqVO vo) {

        System.out.println(vo.getName() + vo.getCompanyName() + vo.getPhone() + vo.getDemand());

        return BaseVO.build200();
    }

    @PostMapping("sub2")
    public BaseVO<String> sub2(@RequestBody SubReqVO vo) {

        System.out.println(vo.getName() + vo.getCompanyName() + vo.getPhone() + vo.getDemand());

        return BaseVO.build200();
    }
}

