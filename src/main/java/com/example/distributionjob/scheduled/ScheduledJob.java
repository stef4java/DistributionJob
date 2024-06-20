package com.example.distributionjob.scheduled;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


/**
 * @author stef4java
 */
@Component
@Slf4j
@EnableScheduling
public class ScheduledJob {

//    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
//    @Scheduled(cron = "* * * * * ? ")
//    public void scheduledJob(){
//        log.info("scheduledJob process...");
//    }
//
//
//    @Scheduled(fixedRate = 3000, initialDelay = 1000)
//    public void job0() throws InterruptedException {
//        log.info("job0 start...");
//        Thread.sleep(5000);
//        log.info("job0 stop...");
//    }


// 🔥01不加 @Component， 不加 @EnableScheduling
// System.out.println 局限
// 系统没完全启动成功就执行
// fixedRate 与 fixedDelay 区别
// 2024-2025年 Cron 表达式
// 在线Cron表达式生成器: https://cron.qqe2.com/    工作日早上8:20-8.25 每分钟提醒一次打卡
// CronTab crontab -e  https://blog.csdn.net/luck_jinwei/article/details/131854018 https://crontab.guru/  只有工作日早上6点到8点

    //initialDelay 延迟启动
    //fixedDelay 固定延迟，时间间隔是前次任务的结束到下次任务的开始
    //fixedRate 时间间隔是前次任务和下次任务的开始


//    @Scheduled(fixedRate = 3000)
//    public void job1() throws InterruptedException {
//        log.info("job1 start...");
//        Thread.sleep(5000);
//        log.info("job1 stop...");
//    }
//
//    @Scheduled(fixedRate = 3000)
//    public void job2() throws InterruptedException {
//        log.info("job2 start...");
//        Thread.sleep(5000);
//        log.info("job2 stop...");
//    }

//🔥02 Schedule 与 multi-Thread


//    @Autowired
//    DoJob doJob;
//    @Scheduled(fixedRate = 3000)
//    public void job3() throws InterruptedException {
//        log.info("job3 start...");
//        doJob.process();
//        log.info("job3 stop...");
//    }
//
//🔥03 Schedule 与 Async


}