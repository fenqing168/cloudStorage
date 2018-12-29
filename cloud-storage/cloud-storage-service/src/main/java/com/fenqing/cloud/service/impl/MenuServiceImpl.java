package com.fenqing.cloud.service.impl;

import com.fenqing.cloud.dao.MenuDao;
import com.fenqing.cloud.pojo.Menu;
import com.fenqing.cloud.service.MenuService;
import com.fenqing.cloud.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 菜单Service实现类
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    public R queryList() {
        List<Menu> menuList = menuDao.queryAllList();
        R r = R.ok(menuList);
        return r;
    }
}
