package myconfigserver.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhaomengxia
 * @create 2019/8/13 10:57
 * 以@RefreshScope注释的Bean可以在运行时刷新
 * 并且使用他们的任何组建将在下一个方法调用上获得一个新实例 完全初始化所有依赖项
 */
@RefreshScope
@RestController
public class ConsumerConfigController {
    //获取外部化配置 key 为spring.datasource.url的键值
    @Value("${spring.datasource.url}")
    private String hello;


    @GetMapping("/hello")
    public String configHelloWorld1() {
        return this.hello;
    }
}
