package cc.adcat.demo;

import java.io.File;

public class Recursion {

    public static int sum(int num){
        if(num == 1){
            return 1;
        }else {
            return num + sum(num - 1);
        }
    }

    public static void printDir(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件名：" + file.getAbsolutePath());
                System.out.println("文件名：" + file.getAbsoluteFile());
            }else {
                System.out.println("目录：" + file.getAbsolutePath());
                System.out.println("目录：" + file.getAbsoluteFile());
                printDir(file);
            }
        }
    }

    public static void printDir(File dir, String str){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
               if (file.getName().endsWith(str)){
                   System.out.println("文件名：" + file.getAbsolutePath());
               }
            }else {
                printDir(file, str);
            }
        }
    }

    public static void printDirFilter(File dir){
        File[] files = dir.listFiles((file)-> {
            return file.isDirectory() || file.getName().endsWith(".txt");
        });
        for (File f : files) {
            if (f.isDirectory()){
                printDirFilter(f);
            }else {
                System.out.println(f.getName());
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
