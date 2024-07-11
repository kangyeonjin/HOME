package com.library.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class BookTemplate {
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getBookSqlSession() {

        if(sqlSessionFactory == null) {
            String resource = "section01/mybatis-config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return sqlSessionFactory.openSession(false);
    }
}
