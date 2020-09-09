package com.stwen.mycat.dao;

import com.stwen.mycat.entity.BranchUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;

import java.math.BigDecimal;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-09
 */
public interface BranchUserDao extends BaseMapper<BranchUser> {

    @Insert("INSERT INTO t_branch_user (id, name, balance) VALUES(#{id}, #{name}, #{balance})")
    int saveOne(Integer id, String name, BigDecimal balance);

}
