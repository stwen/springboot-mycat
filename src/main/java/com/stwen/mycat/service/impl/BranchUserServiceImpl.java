package com.stwen.mycat.service.impl;

import com.stwen.mycat.entity.BranchUser;
import com.stwen.mycat.dao.BranchUserDao;
import com.stwen.mycat.service.IBranchUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-09
 */
@Service
public class BranchUserServiceImpl extends ServiceImpl<BranchUserDao, BranchUser> implements IBranchUserService {

}
