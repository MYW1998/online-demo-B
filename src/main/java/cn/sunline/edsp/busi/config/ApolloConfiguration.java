package cn.sunline.edsp.busi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author meng
 * @Date 2022/3/30 12:08
 */
@Configuration
public class ApolloConfiguration {
    @Value("${someKeyFromApollo:someDefaultValue}")
    String rule;
}
