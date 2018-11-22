package com.census.logdata.timer;

import com.census.logdata.service.CensusService;
import com.census.logdata.service.impl.CensusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author hu_xuanhua_hua
 * @ClassName: Timer
 * @Description: TODO
 * @date 2018-04-11 18:20
 * @versoin 1.0
 **/
@Component
@EnableScheduling
public class Timer {
    @Autowired
    private CensusService censusService;

    @Scheduled(cron = "${getMaterial}")
    public void getMaterial() {
        censusService.getMaterial();
    }
}
