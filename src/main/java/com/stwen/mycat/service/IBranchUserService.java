package com.stwen.mycat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.stwen.mycat.entity.BranchUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-10
 */
public interface IBranchUserService extends IService<BranchUser> {

    /**
     * 分页查询
     *
     * @return
     */
    PageInfo listBypage();

}
