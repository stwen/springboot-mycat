package com.stwen.mycat.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stwen.mycat.dao.BranchUserDao;
import com.stwen.mycat.entity.BranchUser;
import com.stwen.mycat.service.IBranchUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-10
 */
@Service
public class BranchUserServiceImpl extends ServiceImpl<BranchUserDao, BranchUser> implements IBranchUserService {

    @Resource
    private BranchUserDao branchUserDao;

    /**
     * 分页查询
     *
     * @return
     */
    @Override
    public PageInfo listBypage() {

        //分页
        PageHelper.startPage(1, 5);
        // 按id升序
        List<BranchUser> list = branchUserDao.selectList(new QueryWrapper<BranchUser>().orderByAsc("id"));
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
