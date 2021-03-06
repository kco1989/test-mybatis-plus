package com.kco.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Tolerate;
import org.springframework.data.elasticsearch.annotations.Field;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-16 13:57
 */
@Data
@Builder
@TableName(value = "user")
public class UserBean {

    @TableId(type = IdType.NONE)
    private Long id;
    private String email;
    private Integer age;
    private String userName;

    @Tolerate
    public void User() {}
}
