/***********************************************************
 * @Description : 允许跨域访问
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 17:30
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Slf4j
public class CORSConf {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                log.info("初始化 CORSConfiguration 配置");
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedMethods("*")
                        .allowedOrigins("*");
            }
        };
    }
}
