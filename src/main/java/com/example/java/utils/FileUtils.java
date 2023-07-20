package com.example.java.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * <b><code>FileUtils</code></b>
 * <p/>
 * 文件工具类
 * <p/>
 * <b>Creation Time:</b> 2023/7/20 22:21
 *
 * @author yang xiong
 * @since CommonJavaUtils 1.0
 */
@Slf4j
public class FileUtils {

    /**
     * @description: 获取 dir 目录下文件名包含 filter 字符的文件，不包含目录，不会查找子目录
     * @param: dir - [String]
     * @param: filter - [String]
     * @return: java.io.File[]
     * @throws
     * @author yang xiong
     * @date 2023/7/20 22:23
     **/
    public static File[] listFiles(final String dir, final String filter){
        if(null == dir || null == filter){
            return null;
        }
        return new File(dir).listFiles((d, s) -> s.contains(filter));
    }

    /**
     * @description: 获取目录及子目录下所有文件和目录
     * @param: dir - [String]
     * @return: void
     * @throws 
     * @author yang xiong
     * @date 2023/7/20 22:35
     **/
    public static void listFiles(String dir) {
//        Path path = Paths.get(dir);
//        if(Files.exists(path)){
//            Files.walkFileTree(path, new SimplePathVisitor() {
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
////                    Files.delete(file);
//                    System.out.println("file: " + file.getParent().toString() + File.separator + file.getFileName().toString());
//                    return FileVisitResult.CONTINUE;
//                }
//
//                @Override
//                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
////                    Files.delete(dir);
//                    System.out.println("dir: " + dir.getParent().toString() + File.separator + dir.getFileName().toString());
//                    return FileVisitResult.CONTINUE;
//                }
//            });
//        }
    }

}
