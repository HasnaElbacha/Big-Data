package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat; // Importation ajoutée
import org.example.WorldCounMapper;
import org.example.WorldCountReduce;

import java.io.IOException;

public class WorldCountDriver {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        if (args.length < 2) {
            System.err.println("Usage: WorldCountDriver <inputPath> <outputPath>");
            System.exit(1);
        }

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "TP world map");
        job.setJarByClass(WorldCountDriver.class);

        job.setMapperClass(WorldCounMapper.class);
        job.setReducerClass(WorldCountReduce.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1])); // Utilisation de FileOutputFormat pour définir le chemin de sortie

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
