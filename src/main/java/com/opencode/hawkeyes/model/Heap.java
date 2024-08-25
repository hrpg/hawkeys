package com.opencode.hawkeyes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 堆/非堆信息
 *
 * @author CL
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class   77Heap {

    /**
     * 堆初始化大小
     */
    private long heapInit;

    /**
     * 堆最大大小
     */
    private long heapMaxMemory;

    /**
     * 堆已用大小
     */
    private long heapUsedMemory;

    /**
     * 堆空闲大小
     */
    private long heapFreeMemory;

    /**
     * 非堆初始化大小
     */
    private long nonHeapInit;

    /**
     * 非堆最大大小
     */
    private long nonHeapMaxMemory;

    /**
     * 非堆已用大小
     */
    private long nonHeapUsedMemory;

    /**
     * 非堆空闲大小
     */
    private long nonHeapFreeMemory;


}