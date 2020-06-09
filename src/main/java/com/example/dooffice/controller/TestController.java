package com.example.dooffice.controller;

import com.alibaba.excel.EasyExcel;
import com.example.dooffice.entity.DemoData;
import com.example.dooffice.read.DemoDataListener;
import com.example.dooffice.read.TestFileUtil;
import com.example.dooffice.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;

/**
 * @author WU
 */
@Controller
public class TestController {
    @Resource
    private DemoService demoService;
    /**
     * 最简单的读
     * <p>1. 创建excel对应的实体对象 参照{@link DemoData}
     * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link DemoDataListener}
     * <p>3. 直接读即可
     */
    @GetMapping("/read")
    @ResponseBody
    public String simpleRead() {
        //读取项目中 resource 下 文件
        String fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xlsx";
        System.out.println(fileName);
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener(demoService)).sheet().doRead();
        return "操作成功";
    }

}
