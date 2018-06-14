package YoutubeAnalysis;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class YoutubeCategory {

	public static class CategoryMapper extends Mapper<LongWritable,Text,Text,IntWritable>{
		Text category = new Text();
		int count = 1;
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException{
			String[] splits = value.toString().split("\t");
			if(splits.length > 5){
				category.set(splits[3]);
			}
			context.write(category, new IntWritable(count));
		}
	}
	public static class CategoryReducer extends Reducer<Text,IntWritable,Text,IntWritable>{
			public void reduce(Text key,Iterable<IntWritable> values, Context context) throws IOException, InterruptedException{
				int count = 0;
				for(IntWritable val : values){
					count = count + val.get();
				}
				context.write(key, new IntWritable(count));
			}
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException{
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "Youtube Category Analysis");
		job.setJarByClass(YoutubeCategory.class);
		job.setMapperClass(CategoryMapper.class);
		job.setReducerClass(CategoryReducer.class);
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		Path outputPath = new Path(args[1]);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, outputPath);
		
		outputPath.getFileSystem(conf).delete(outputPath, true);
		System.exit(job.waitForCompletion(true) ? 0:1);
		
		
	}
}
