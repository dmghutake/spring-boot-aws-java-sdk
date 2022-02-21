package com.dmg.aws.sdk.springbootawsjavasdk;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;

@SpringBootApplication
public class SpringBootAwsJavaSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsJavaSdkApplication.class, args);
		//Create AWS S3 client
		AwsBasicCredentials create = AwsBasicCredentials.create("Access Key", "Secrete Access Key0000");
		S3Client s3Client = S3Client.builder().credentialsProvider(new AwsCredentialsProvider() {
          
          @Override
          public AwsCredentials resolveCredentials() {
            return create;
          }
        }).build();
		ListBucketsResponse listBucketsResponse = s3Client.listBuckets();
		List<Bucket> buckets = listBucketsResponse.buckets();
		buckets.stream().forEach(bucket ->{
		  System.out.println("Bucket Name: "+bucket.name()
		      +"Bucket Creation Date: "+ bucket.creationDate());
		});
	}

}
