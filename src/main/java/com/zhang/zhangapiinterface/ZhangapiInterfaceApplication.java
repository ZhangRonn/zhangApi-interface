package com.zhang.zhangapiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * YuApi 模拟接口入口类
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@SpringBootApplication
public class ZhangapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhangapiInterfaceApplication.class, args);
        System.out.println("interface模块启动成功");
    }

}
