package com.opencode.hawkeyes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disk {

    /**
     * 盘符
     */
    private List<Drive> devices;

    /**
     * 盘符
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Drive {

        /**
         * 盘符名称
         */
        private String name;

        /**
         * 总大小
         */
        private long totalSpace;

        /**
         * 空闲大小
         */
        private long freeSpace;

        /**
         * 已用大小
         */
        private long usedSpace;

        /**
         * 盘符使用率
         */
        private BigDecimal driveUsage;


    }

}
