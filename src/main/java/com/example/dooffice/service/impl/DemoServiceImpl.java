package com.example.dooffice.service.impl;

import com.example.dooffice.dao.DemoDao;
import com.example.dooffice.entity.DemoData;
import com.example.dooffice.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WU
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private DemoDao demoDao;
    @Override
    public void save(List<DemoData> list) {
        List<DemoData> demoData = demoDao.saveAll(list);
    }
}
