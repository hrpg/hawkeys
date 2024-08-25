package com.opencode.hawkeyes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 线程信息
 *
 * @author CL
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Thread {

    /**
     * 活动线程数
     */
    private int threadCount;

    /**
     * 峰值活动线程数
     */
    private int peakThreadCount;

    /**
     * 守护线程数
     */
    private int daemonThreadCount;

    /**
     * 非守护线程数
     */
    private int nonDaemonThreadCount;

    /**
     * 总线程数
     */
    private long totalStartedThreadCount;


}

