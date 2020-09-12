package com.stwen.mycat.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stwen.mycat.entity.BranchUser;
import org.apache.ibatis.annotations.Insert;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-10
 */
public interface BranchUserDao extends BaseMapper<BranchUser> {

    @Insert("INSERT INTO t_branch_user (id, name, age) VALUES(#{id}, #{name}, #{age})")
    int saveOne(Integer id, String name, int age);
}
