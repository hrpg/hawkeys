package com.opencode.hawkeyes.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 垃圾回收信息
 *
 * @author CL
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Gc {

    /**
     * GC收集器
     */
    private List<GcCollector> collectors;

    /**
     * GC收集器
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GcCollector {

        /**
         * 收集器名称
         */
        private String name;

        /**
         * 收集总数
         */
        private long count;

        /**
         * 收集耗时
         */
        private long time;

    }

}
