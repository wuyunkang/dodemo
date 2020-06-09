package com.example.dooffice.dao;

import com.example.dooffice.entity.DemoData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 假设这个是你的DAO存储。当然还要这个类让spring管理，当然你不用需要存储，也不需要这个类。
 *
 * @author Jiaju Zhuang
 **/
public interface DemoDao extends JpaRepository<DemoData,String> {

}
