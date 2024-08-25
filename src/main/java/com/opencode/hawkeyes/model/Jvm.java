package com.opencode.hawkeyes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jvm {

    /**
     * 虚拟机名称
     */
    private String vmName;

    /**
     * JDK版本
     */
    private String jdkVersion;

    /**
     * JavaHome
     */
    private String javaHome;

    /**
     * 进程号
     */
    private String pid;

    /**
     * 启动时间
     */
    private LocalDateTime startTime;

    /**
     * 运行时长
     */
    private long runtime;

    /**
     * 启动餐参数
     */
    private List<String> startParameters;

}

