package com.fu;

import com.fu.entity.Orders;
import com.fu.entity.User;
import com.fu.mapper.OrdersMapper;
import com.fu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.apache.ibatis.io.Resources.getResourceAsStream;

/**
 * @Auther: Fuys
 * @Date: 2023/2/14 - 02 - 14 - 21:48
 * @Description: com.fu
 * @version: 1.0
 */
public class fuTest {
    //输入流
    public static InputStream resourceAsStream = null;
    //sqlSession工厂
    public static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            //加载xml配置文件,获取输入流
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //sql会话工厂生成器根据数据流创建sql会话工厂
            sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void showOrders() {
        SqlSession sqlSession = null;
        try {
            //sql工厂打开会话
            sqlSession = sqlSessionFactory.openSession();
            //获取order映射
            OrdersMapper orderMapper = sqlSession.getMapper(OrdersMapper.class);
            List<Orders> orders = orderMapper.showOrdersAndUser();

            for (Orders order : orders) {
                if(order!=null) {
                    System.out.println(order.toString());
                    User user = order.getUser();
                    if(user!=null)
                    System.out.println(user.toString());
                }
            }
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void showUserAndOrders() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.showUserAndOrders();
            System.out.println(user.toString());


        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void showUsersAndRoles() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.showUsersAndRoles();
            for (int i = users.size() - 1; i >= 0; i--) {
                System.out.println(users.get(i).toString());
            }


        }finally {
            sqlSession.close();
        }
    }
}
