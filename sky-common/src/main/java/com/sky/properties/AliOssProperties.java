package com.sky.properties;

import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyuncs.exceptions.ClientException;
import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "sky.alioss")
public class AliOssProperties {


//    @Value("${sky.alioss.enendpoint}")
    private String endpoint;


    EnvironmentVariableCredentialsProvider credentialsProvider;

    {
        try {
            credentialsProvider = CredentialsProviderFactory.newEnvironmentVariableCredentialsProvider();
        } catch (ClientException e) {
            throw new RuntimeException(e);
        }
    }


    // 填写Bucket名称@Value("${sky.alioss.bucket-name}")
    private String bucketName;




}
