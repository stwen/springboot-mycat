package com.stwen.mycat.controller;


import com.github.pagehelper.PageInfo;
import com.stwen.mycat.dao.BranchUserDao;
import com.stwen.mycat.entity.BranchUser;
import com.stwen.mycat.service.IBranchUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-09
 */
@RestController
@RequestMapping("/branch-user")
public class BranchUserController {

    @Resource
    private BranchUserDao branchUserDao;

    @Autowired
    private IBranchUserService branchUserService;

    /**
     * 新增
     *
     * @return
     */
    @RequestMapping("/save")
    public int save() {

        // 分库表，需要手动设置id
//        BranchUser branchUser = new BranchUser();
//        branchUser.setId(5).setName("stwen").setBalance(new BigDecimal(99.9));
//        int num = branchUserDao.insert(branchUser);
        int num = branchUserDao.saveOne(13, "stwen", new BigDecimal(99.9));

        return num;
    }

    /**
     * 所有记录
     *
     * @return
     */
    @RequestMapping("/query")
    public List<BranchUser> query() {
        List<BranchUser> list = branchUserDao.selectList(null);
        return list;
    }

    /**
     * 列表分页查询
     *
     * @return
     */
    @RequestMapping("/listByPage")
    public PageInfo listBypage() {
        PageInfo pageInfo = branchUserService.listBypage();
        return pageInfo;
    }

}
