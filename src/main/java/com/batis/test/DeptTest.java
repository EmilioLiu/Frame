package com.batis.test;

import com.batis.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class DeptTest {

    static SqlSession session;
    @BeforeClass
    public static void init(){
        try {
            // 1. 加载配置
            Reader config = Resources.getResourceAsReader("mybatis-config.xml");
            // 2. 创建 Session 工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
            // 3. 开启 Session 得到 Session 对象
            session = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetAllDept(){
        // 4. 通过 Session 调用指定配置的 Sql 语句
        List<Dept> list = session.selectList("getAllDept");
        for (Dept dept: list){
            System.out.println(dept);
        }
    }

    @Test
    public void testAddNewDept(){
        Dept dept = new Dept();
        dept.setDeptno(100);
        dept.setDname("李四");
        dept.setLoc("轨道交通智能机辆学院");
        int result = session.insert("addNewDept",dept);
        session.commit();
        Assert.assertTrue(result == 1);
    }

    @Test
    public void testUpdateDeptInformation(){
        Dept dept = new Dept();
        dept.setDeptno(100);
        dept.setDname("张三");
        dept.setLoc("轨道交通智能控制学院");
        int result = session.update("updateDeptInformation",dept);
        session.commit();
        Assert.assertTrue(result == 1);
    }
}
