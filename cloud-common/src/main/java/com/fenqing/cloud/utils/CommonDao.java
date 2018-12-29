package com.fenqing.cloud.utils;

import java.util.List;

public interface CommonDao<T> {

    /**
     * 无参，查询全部
     * @return
     */
    List<T> queryAllList();

}
