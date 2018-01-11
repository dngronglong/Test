package org.project.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisSqlSession {
    /**
     * 创建session工长
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory(){
        String path="mybitsConfig.xml";
        InputStream inputStream=null;
        SqlSessionFactory sqlSessionFactory=null;
        try {
            inputStream= Resources.getResourceAsStream(path);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    /**
     * 得到SQLSession
     * @return
     */
    public static SqlSession getSession() {
        SqlSession sqlSession=getSqlSessionFactory().openSession();
        return sqlSession;
    }

    public static SqlSession getSession(boolean b){
        SqlSession sqlSession=getSqlSessionFactory().openSession(b);
        return sqlSession;
    }
}
