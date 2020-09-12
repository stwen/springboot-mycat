package com.stwen.mycat.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author stwen_gan
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_task_test")
public class TaskTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String orgCode;

    private String title;


}
