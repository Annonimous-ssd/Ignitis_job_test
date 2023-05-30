package com.example.ignitis_job_test.Services;

import com.example.ignitis_job_test.DAO.StatisticDao;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {
    private final StatisticDao statisticDao;

    public Object getStatistic(String userName) {
        return this.statisticDao.getStatistic(userName);
    }

    public StatisticService(final StatisticDao statisticDao) {
        this.statisticDao = statisticDao;
    }
}
