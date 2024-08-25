package com.opencode.hawkeyes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * CPU信息
 *
 * @author  CL
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cpu {

    /**
     * 可用处理器数
     */
    private int availableProcssors;

    /**
     * 系统CPU使用率
     */
    private double systemCpuUsage;

    /**
     * 当前进程CPU使用率
     */
    private double processCpuUsage;


}
