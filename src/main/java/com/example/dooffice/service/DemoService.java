package com.example.dooffice.service;

import com.example.dooffice.entity.DemoData;

import java.util.List;

/**
 * @author WU
 */
public interface DemoService {
    /**
     * 存储数据
      * @param list
     */
    void save(List<DemoData> list);
}
