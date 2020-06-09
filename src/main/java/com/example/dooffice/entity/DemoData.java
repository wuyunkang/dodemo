package com.example.dooffice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 基础数据类.这里的排序和excel里面的排序一致
 *
 * @author Jiaju Zhuang
 **/
@Data
@Entity
public class DemoData {
    @Id
    private String string;
    private Date date;
    private Double doubleData;
}
