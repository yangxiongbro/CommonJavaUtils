package com.example.java.utils;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * <b><code>FileUtilsTest</code></b>
 * <p/>
 * 测试文件工具类
 * <p/>
 * <b>Creation Time:</b> 2023/7/20 22:36
 *
 * @author yang xiong
 * @since CommonJavaUtils 1.0
 */
public class FileUtilsTest {

    @Test
    public void listFiles(){
        File[] files = FileUtils.listFiles("C:\\Users\\young\\Desktop\\temp", "pas");
        for(File file:files){
            System.out.println(file.getName());
        }
        FileUtils.listFiles("C:\\Users\\young\\Desktop\\temp");
    }

}
