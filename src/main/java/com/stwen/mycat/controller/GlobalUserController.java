package com.stwen.mycat.controller;


import com.stwen.mycat.dao.GlobalUserDao;
import com.stwen.mycat.entity.GlobalUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-10
 */
@RestController
@RequestMapping("/global-user")
public class GlobalUserController {

    @Resource
    private GlobalUserDao globalUserDao;

    @RequestMapping("/save")
    public int save() {

        // 全局表，不用手动设定id
        GlobalUser globalUser = new GlobalUser();
        globalUser.setName("stwen").setAge(18);
        int num = globalUserDao.insert(globalUser);
//        int num = globalUserDao.saveOne(13, "stwen", 18);
        return num;
    }
}
