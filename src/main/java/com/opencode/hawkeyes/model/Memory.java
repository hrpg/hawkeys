package com.opencode.hawkeyes.model;

import cn.hutool.core.util.NumberUtil;
import com.c3stones.monitor.print.Layout;
import com.c3stones.monitor.utils.ByteUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 内存信息
 *
 * @author CL
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Memory {

    /**
     * 总物理内存
     */
    private long totalPhysicalMemory;

    /**
     * 空闲物理内存
     */
    private long freePhysicalMemory;

    /**
     * 已使用物理内存
     */
    private long usedPhysicalMemory;

    /**
     * 物理内存使用率
     */
    private BigDecimal physicalMemoryUsage;

    /**
     * 总内存
     */
    private long totalMemory;

    /**
     * 空闲内存
     */
    private long freeMemory;

    /**
     * 已用内存
     */
    private long usedMemory;

    /**
     * 最大内存
     */
    private long maxMemory;

    /**
     * 最大可用内存
     */
    private long maxUseMemory;

    /**
     * 内存使用率
     */
    private BigDecimal memoryUsage;


}