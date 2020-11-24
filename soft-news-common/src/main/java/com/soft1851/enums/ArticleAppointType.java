package com.soft1851.enums;

/**
 * @ClassName: das
 * @Description: TODO
 * @Author: WangLinLIN
 * @Date: 2020/11/24 19:12:34 
 * @Version: V1.0
 **/
public enum ArticleAppointType {
    TIMING(1,"文章定时发布-定时"),
    IMMEDIATELY(0,"文章立即发布-即时");
    public final Integer type;
    public final String value;
    ArticleAppointType(Integer type,String value){
        this.type = type;
        this.value = value;
    }
}
