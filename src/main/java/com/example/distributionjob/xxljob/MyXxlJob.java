package com.example.distributionjob.xxljob;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class MyXxlJob {

    @XxlJob("demoJobHandler")
    public ReturnT<String> execute(String param) {
        //0 * * * * ?
//        log.info("demoJobHandler execute...");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        从数据库里查询所有待下载的资源，进行下载
//        10w资源，2台服务器，每台下5w资源，耗时减半

        // 有多少台机子，可水平扩容
        int shardTotal = XxlJobHelper.getShardTotal();
        // 当前机子 index
        int shardIndex = XxlJobHelper.getShardIndex();
        // 模拟待下载的资源id集合
        List<Integer> pendingResources = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (Integer i : pendingResources) {
            //取模分片
            if (i % shardTotal == shardIndex) {
                log.info("demoJobHandler execute...resourceId={}. shardIndex={}， shardTotal={}",
                        i, shardIndex, shardTotal);
            }
        }
        return ReturnT.SUCCESS;
    }
}