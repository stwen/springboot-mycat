package com.stwen.mycat.service.impl;

import com.stwen.mycat.entity.GlobalUser;
import com.stwen.mycat.dao.GlobalUserDao;
import com.stwen.mycat.service.IGlobalUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-10
 */
@Service
public class GlobalUserServiceImpl extends ServiceImpl<GlobalUserDao, GlobalUser> implements IGlobalUserService {

}
