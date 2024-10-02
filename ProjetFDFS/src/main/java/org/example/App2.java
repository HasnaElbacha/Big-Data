package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class App2 {
    public static void main(String[] args) throws IOException {
        Configuration conf= new Configuration();
        conf.set("fs.defaultFS","hdfs://namenode:8082");
        FileSystem fs=FileSystem.get(conf);
        Path path = new Path("./file.txt");
        FSDataInputStream fis=fs.open(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String ligne = null;
        while((ligne=br.readLine())!=null){
            System.out.println(ligne);
        }
        br.close();
        fs.close();
    }
}
