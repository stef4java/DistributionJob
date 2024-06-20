package com.example.distributionjob.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DoJob {

   // 注意服务器资源,避免开启过多的线程
    @Async
    public void process() throws InterruptedException {
        Thread.sleep(5000);
    }

}
