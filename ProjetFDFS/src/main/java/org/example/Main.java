package org.example;


import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Zokiper kafka
public class Main {
    public static void main(String[] args) throws IOException {
        Configuration conf=new Configuration();
        conf.set("fs.defaultFS","hdfs://namenode:8082");
        FileSystem fs=FileSystem.get(conf);
        Path path = new Path("./file.txt");
        FSDataOutputStream fos=fs.create(path);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(fos));
        bw.write("Bonjour");
        bw.write("BDCC 2");
        bw.write("End");
        bw.close();
        fs.close();

    }
}