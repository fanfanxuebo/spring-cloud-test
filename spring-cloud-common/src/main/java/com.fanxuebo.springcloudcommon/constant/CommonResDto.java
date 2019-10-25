package com.fanxuebo.springcloudcommon.constant;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther fanxuebo
 * @description 公共响应对象（针对前端）
 * @Company sinosig
 * @createDate 2019-10-25 16:08:58 星期五
 */
@Getter
@Setter
public class CommonResDto<T> implements Serializable {
    private static final long serialVersionUID = 5098229702138714205L;
    /**响应编码*/
    private String resultCode;
    /**响应详细信息*/
    private T resultMsg;
    /**提取时间（数据库查询时间）*/
    private Date executeSqlTime;
    /**页面按钮展示*/
    private T displayStatus;

    public CommonResDto() {
    }

    public CommonResDto(T successResultMsg, Date executeSqlTime, T displayStatus) {
        this.resultCode = ConstantRes.SUCCESS_CODE;
        this.resultMsg = successResultMsg;
        this.executeSqlTime = executeSqlTime;
        this.displayStatus = displayStatus;
    }

    public CommonResDto(T errorResultMsg) {
        this.resultCode = ConstantRes.ERROR_CODE;
        this.resultMsg = errorResultMsg;
    }
}
