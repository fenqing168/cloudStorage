package com.fenqing.cloud.controller;

import com.fenqing.cloud.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fenqing.cloud.utils.R;

@Controller
@RequestMapping("/sys/meun")
public class MenuController {

    @Autowired
    private MenuService menuService;

        @RequestMapping("/list")
    private R getList(){
        return menuService.queryList();
    }

}
