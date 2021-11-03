package com.leno.file;

import java.io.File;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-30 22:42
 */
public class FileDemo {

    //递归打印指定盘符内的所有文件的绝对路径
    private void shwoPath(String path) throws Exception{
        File file = new File(path);
        if(file != null && file.exists() && file.canRead()){
            if(file.isFile()){
                System.out.println(file.getCanonicalPath());
            }else if(file.isDirectory()){
                String[] filestrs = file.list();
                if(filestrs != null){
                    for(String fileStr : filestrs){
                        shwoPath(path+File.separator+fileStr);
                    }
                }
                //shwoPath(path);
            }
        }
    }
    public static void main(String[] args) {
        FileDemo fileDemo = new FileDemo();
        try {
            fileDemo.shwoPath("C://");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
