package com.opencode.hawkeyes.model;

import com.c3stones.monitor.print.Layout;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 服务器信息
 *
 * @author CL
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Server {

    /**
     * 主机名
     */
    private String hostName;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统版本
     */
    private String osVersion;

    /**
     * 系统架构
     */
    private String arch;

    /**
     * 本地IP
     */
    private String localIp;


}

