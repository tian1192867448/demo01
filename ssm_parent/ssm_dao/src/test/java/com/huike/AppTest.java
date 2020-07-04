package com.huike;

import static org.junit.Assert.assertTrue;

import com.huike.dao.UmsadminDao;
import com.huike.po.Umsadmin;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class AppTest {

    @Test
    public void queryAllUmsadmin(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        UmsadminDao umsadminDao= (UmsadminDao) applicationContext.getBean("umsadminDao");
        List<Umsadmin> list=umsadminDao.queryAllUmsadmin();
        for (Umsadmin umsadmin : list) {
            System.out.println(umsadmin.getId());
        }
    }
}
