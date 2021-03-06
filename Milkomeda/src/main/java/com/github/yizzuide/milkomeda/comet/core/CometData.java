package com.github.yizzuide.milkomeda.comet.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

/**
 * CometData
 *
 * @author yizzuide
 * @since 0.2.0
 * @version 3.0.5
 * Create at 2019/09/21 00:48
 */
@Data
@ToString(exclude = {"attachment", "request"})
public class CometData implements Serializable {
    private static final long serialVersionUID = -8296355140769902642L;
    /**
     * 日志记录名
     */
    private String name;
    /**
     * 日志描述
     * @deprecated deprecated at 1.12.0，use <code>name</code>.
     */
    private String description;
    /**
     * 记录数据 prototype（原型）的相应tag，用于请求分类，用于收集不同的类型数据
     */
    private String tag;
    /**
     * 服务器地址
     */
    private String host;
    /**
     * 微服务名
     */
    private String microName;
    /**
     * 类名
     */
    private String clazzName;
    /**
     * 执行的方法
     */
    private String execMethod;
    /**
     * 请求时间
     */
    private Date requestTime;
    /**
     * 方法参数
     */
    private String requestData;
    /**
     * 响应时间
     */
    private Date responseTime;
    /**
     * 处理耗时
     */
    private String duration;
    /**
     * 响应数据
     */
    private String responseData;
    /**
     * 状态
     */
    private String status;
    /**
     * 错误信息
     */
    private String errorInfo;
    /**
     * 栈信息
     */
    private String traceStack;
    /**
     * 跟踪附件，用于设置日志记录实体
     */
    @JsonIgnore
    private transient Object attachment;
    /**
     * 请求对象
     */
    @JsonIgnore
    private transient HttpServletRequest request;

    /**
     * 传递给日志收集器的意图数据
     * @since 3.0.5
     */
    @JsonIgnore
    private transient Object intentData;

    /**
     * 标识失败并设置异常，日志收集器将走失败没流程
     * @since 3.0.5
     */
    @JsonIgnore
    private transient Object failure;
}
