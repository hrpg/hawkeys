package com.opencode.hawkeyes.service;

import com.opencode.hawkeyes.model.Cpu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MonitorService.class})
@ExtendWith(SpringExtension.class)
public class MonitorServiceTest {

    @Autowired
    private MonitorService monitorService;

    @Test
    void testCpu() {

        Cpu cu = monitorService.cpu();
        System.out.println(cu);
    }
}
