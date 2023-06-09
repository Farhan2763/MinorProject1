/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Md Farhan
 */

    package comp.comp.comp.comp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compressor{
    public static void method(File file)throws IOException {
        String fileDirectory=file.getParent();
        try (FileInputStream fis = new FileInputStream(file); FileOutputStream fos = new FileOutputStream(fileDirectory+ "/compressedFile.gz"); 
                GZIPOutputStream gzip = new GZIPOutputStream(fos)) {
            
            byte[] buffer=new byte[1024];
            int len;
            
            while((len=fis.read(buffer))!=-1){
                gzip.write(buffer,0,len);
            }
        }

}
public static void main(String[] args) throws IOException{
    File path;
        path = new File("C:/Users/Farhan/NetBeansProjects/Testfile");
    method(path);
}
}