package com.kco.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kco.bean.UserBean;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-16 13:57
 */
public interface UserMapper extends BaseMapper<UserBean> {
    @Select("select * from user")
    @ResultType(UserBean.class)
    List<UserBean> selectAll();

    @Select("select * from user")
    IPage<UserBean> selectPageVo(Page page);
}
