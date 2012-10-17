package org.fiz.karlsruhe.hadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class StubMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
	
	@Override
	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

}
