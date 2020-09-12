package com.stwen.mycat.controller;


import com.github.pagehelper.PageInfo;
import com.stwen.mycat.dao.TestDao;
import com.stwen.mycat.entity.Test;
import com.stwen.mycat.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-12
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestDao testDao;
    @Autowired
    private ITestService testService;

    /**
     * 新增
     * @return
     */
    @RequestMapping("/save")
    public int save() {
        Test entity = new Test();
        entity.setTitle("马马哈哈");
        int num = testDao.insert(entity);
        return num;
    }

    /**
     * 所有记录
     * @return
     */
    @RequestMapping("/list")
    public List<Test> query() {
        List<Test> list = testDao.selectList(null);
        return list;
    }

    /**
     * 列表分页查询
     * @return
     */
    @RequestMapping("/listByPage")
    public PageInfo listBypage() {
        PageInfo pageInfo = testService.listBypage();
        return pageInfo;
    }
}
