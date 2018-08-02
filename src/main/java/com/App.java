package com;

import com.pojo.User;
import com.tool.CacheFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        CacheFactory.setCache("wjz",new User("wjz", "123"));

        CacheFactory.setCache("admin",new User("admin", "123"));
        CacheFactory.setCache("hase",new User("hase", "123"));
        SpringApplication.run(App.class, args);
    }
}
