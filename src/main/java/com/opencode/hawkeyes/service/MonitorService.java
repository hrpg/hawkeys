package com.opencode.hawkeyes.service;


import com.opencode.hawkeyes.model.Cpu;
import com.opencode.hawkeyes.model.Heap;
import com.opencode.hawkeyes.model.Memory;
import com.opencode.hawkeyes.model.Thread;
import lombok.extern.slf4j.Slf4j;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.ThreadMXBean;

import com.sun.management.OperatingSystemMXBean;

@Slf4j
public class MonitorService {

    public Cpu cpu() {

        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory
                .getPlatformMXBean(OperatingSystemMXBean.class);

        return Cpu.builder()
                .availableProcssors(operatingSystemMXBean.getAvailableProcessors())
                .systemCpuUsage(operatingSystemMXBean.getCpuLoad())
                .processCpuUsage(operatingSystemMXBean.getProcessCpuLoad())
                .build();
    }

    private Heap heap() {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();
        return Heap.builder()
                .heapInit(heapMemoryUsage.getInit())
                .heapMaxMemory(heapMemoryUsage.getMax())
                .heapUsedMemory(heapMemoryUsage.getUsed())
                .heapFreeMemory(heapMemoryUsage.getMax() - heapMemoryUsage.getUsed())
                .nonHeapInit(nonHeapMemoryUsage.getInit())
                .nonHeapMaxMemory(nonHeapMemoryUsage.getMax())
                .nonHeapUsedMemory(nonHeapMemoryUsage.getUsed())
                .nonHeapFreeMemory(nonHeapMemoryUsage.getMax() - nonHeapMemoryUsage.getUsed())
                .build();
    }

    private Thread thread() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        return Thread.builder()
                .threadCount(threadMXBean.getThreadCount())
                .peakThreadCount(threadMXBean.getPeakThreadCount())
                .daemonThreadCount(threadMXBean.getDaemonThreadCount())
                .nonDaemonThreadCount(threadMXBean.getThreadCount() - threadMXBean.getDaemonThreadCount())
                .totalStartedThreadCount(threadMXBean.getTotalStartedThreadCount())
                .build();
    }

    private Memory memory() {
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory
                .getPlatformMXBean(OperatingSystemMXBean.class);

        long totalPhysicalMemory = operatingSystemMXBean.getTotalMemorySize();
        long freePhysicalMemory = operatingSystemMXBean.getFreeMemorySize();
        long usedPhysicalMemory = totalPhysicalMemory - freePhysicalMemory;
        Runtime runtime = Runtime.getRuntime();
        return Memory.builder()
                .totalPhysicalMemory(totalPhysicalMemory)
                .freePhysicalMemory(freePhysicalMemory)
                .usedPhysicalMemory(usedPhysicalMemory)
                .physicalMemoryUsage(usedPhysicalMemory / totalPhysicalMemory)
                .totalMemory(runtime.totalMemory())
                .freeMemory(runtime.freeMemory())
                .usedMemory(runtime.totalMemory() - runtime.freeMemory())
                .maxMemory(runtime.maxMemory())
                .maxUseMemory(runtime.maxMemory() - runtime.totalMemory() + runtime.freeMemory())
                .memoryUsage((runtime.totalMemory() - runtime.freeMemory()) / runtime.totalMemory())
                .build();
    }

}
