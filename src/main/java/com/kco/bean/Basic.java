package com.kco.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-16 16:07
 */
@Data
public class Basic {
    @TableLogic
    private String deleteFlag;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.UPDATE)
    private String updateUid;
    @TableField(fill = FieldFill.INSERT)
    private String createUid;
}
