package com.example.distributionjob.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;

//@Configuration
public class QuartJobConfig {

    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(MyQuartzJob.class)
                .withIdentity("job1", "group1")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger trigger() {
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail())
                .withIdentity("trigger1", "group1")
                .startNow()
                .withSchedule(CronScheduleBuilder.cronSchedule("0,5 * * * * ?"))
                .build();
    }
}