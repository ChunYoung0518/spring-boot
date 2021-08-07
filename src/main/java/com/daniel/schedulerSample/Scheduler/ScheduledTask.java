package com.daniel.schedulerSample.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduledTask {

    @Scheduled(fixedDelay = 5000)
    public void scheduledWithFixedDelay() {
        System.out.println("Fixed delay task executed at: " + LocalDateTime.now());
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void scheduledWithCron() {
        System.out.println("Cron scheduled task executed at: " + LocalDateTime.now());
    }
}
