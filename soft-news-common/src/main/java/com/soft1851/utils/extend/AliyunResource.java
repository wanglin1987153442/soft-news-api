package com.soft1851.utils.extend;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AliyunResource
 * @Description: TODO
 * @Author: WangLinLIN
 * @Date: 2020/11/15 20:53:46 
 * @Version: V1.0
 **/
@Component
@PropertySource("classpath:aliyun.properties")
@ConfigurationProperties(prefix = "aliyun")
public class AliyunResource {
    private String accessKeyId;
    private  String accessKeySecret;
    public String getAccessKeyId(){
        return accessKeyId;
    }
    public  void  setAccessKeyId(String accessKeyId){
        this.accessKeyId=accessKeyId;
    }
    public String getAccessKeySecret(){
        return  accessKeySecret;
    }
    public void setAccessKeySecret(String accessKeySecret){
        this.accessKeySecret=accessKeySecret;
    }
}
