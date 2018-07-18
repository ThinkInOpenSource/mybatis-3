package com.luo.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiangnan
 */
public class DemoMain {

    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("conf.xml");

        // 构建sqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSessionFactory.openSession();

        PersonDao personDao = session.getMapper(PersonDao.class);
        System.out.println(personDao.selectById(1));
    }

}
