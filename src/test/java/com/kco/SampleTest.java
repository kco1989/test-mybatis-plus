package com.kco;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kco.bean.UserBean;
import com.kco.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-16 13:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("--- selectAll method test ----");
        List<UserBean> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        Assert.assertEquals(5, users.size());
        System.out.println("---- after delete -------");
        userMapper.delete(null);
        List<UserBean> users2 =  userMapper.selectAll();
        users2.forEach(System.out::println);
        System.out.println("==================");
        List<UserBean> id = userMapper.selectList(new QueryWrapper<UserBean>().eq("id", 2));
        id.forEach(System.out::println);
    }

    @Test
    public void pageTest() {
        IPage<UserBean> userIPage = userMapper.selectPageVo(new Page(0, 2));
        System.out.println(userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
    }
    @Test
    public void pageTest2() {
        Page page = new Page(0, 2);
        page.setOptimizeCountSql(false);
        IPage<UserBean> userIPage = userMapper.selectPageVo(new Page(0, 2));
        System.out.println(userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
    }

    @Test
    public void pageTest3() {
        Page page = new Page(0, 2);
        page.setTotal(1);
        IPage<UserBean> userIPage = userMapper.selectPageVo(new Page(0, 2));
        System.out.println(userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
    }
    @Test
    public void testAdd() {
        UserBean ss = UserBean.builder()
                .email("ss@ss.ss")
                .age(15).build();

        int insert = userMapper.insert(ss);
        System.out.println(insert);
        System.out.println(ss);
        System.out.println("-------->" +ss.getId());
        UserBean age = userMapper.selectOne(new QueryWrapper<UserBean>().eq("age", 15));
        System.out.println(age);
        System.out.println("==============");
        age.setAge(16);
        userMapper.updateById(age);
        System.out.println(age);
    }

}
