package com.kco.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-16 17:59
 */
@Component
@Log4j2
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("insertFill ....");
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("createUid", "123", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("updateFill ....");
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("updateUid", "456", metaObject);
    }
}
