package com.stwen.mycat.service;

import com.github.pagehelper.PageInfo;
import com.stwen.mycat.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-12
 */
public interface ITestService extends IService<Test> {

    PageInfo listBypage();
}
