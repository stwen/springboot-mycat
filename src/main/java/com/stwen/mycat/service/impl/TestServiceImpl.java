package com.stwen.mycat.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stwen.mycat.dao.TestDao;
import com.stwen.mycat.entity.Test;
import com.stwen.mycat.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-12
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements ITestService {

    @Resource
    private TestDao testDao;

    /**
     * 列表分页查询
     * @return
     */
    @Override
    public PageInfo listBypage() {

        //分页，每页10条
        PageHelper.startPage(1, 10);
        // 按id升序
        List<Test> list = testDao.selectList(new QueryWrapper<Test>().orderByAsc("id"));
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
