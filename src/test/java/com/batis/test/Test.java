package com.batis.test;

import com.batis.dao.DeptEmpMapper;
import com.batis.pojo.Dept1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test{
    @org.junit.Test
    public  void  test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptEmpMapper deptMapper = ctx.getBean(DeptEmpMapper.class);
        List<Dept1> dept1List=  deptMapper.selectAllDeptAndEmp();
        System.out.println(dept1List);

    }
}
