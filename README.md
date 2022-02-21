# AWS SDK for Java:
* Provides a Java API for AWS services.
* Build Java Based applications with Amazon Web services such as S3, DynamoDB,EC2, IAM etc.
* Provides support for API lifecycle consideration such as credential management, retries, data marshaling, and serialization.

## Pre-requisite: 
  * Java 1.8 + and Apache maven
### Create AWS Root Account
  * If haven't created an aws account , you can create one by following detailed instruction on this [aws account creation and activation page](https://aws.amazon.com/premiumsupport/knowledge-center/create-and-activate-aws-account/).
### Create IAM User
 * Login with Root account ,create administrative group under IAM Section. 
 * Creat IAM User with administrative access
 * Sign-in Link
   * https://`<AccountId>`.signin.aws.amazon.com/console
   * https://<`Alias>`.signin.aws.amazon.com/console

### AWS Command Line Interface (CLI)
 * Install [AWS CLI](https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html) in your laptop
 * Used later for demonstrating invocation of prediction 
 * service from outside of AWS

### Configure Users’ credentials.
 * Configure CLI with admin user
   ```
   aws configure --profile adminuser
   AWS Access Key ID [None]: Access Key ID
   AWS Secret Access Key [None]: Secret Access Key
   Default region name [None]: us-east-1
   Default output format [None]:
   ```
 * Verify Access – List S3 Buckets in your account
   ```
   aws s3 ls --profile adminuser
   ```
### Create Spring Boot project with Initializer.
  * create spring boot maven project with https://start.spring.io/
### Setup AWS SDK with maven.
 * Recommended to use Bill of Material of AWS SDK. 
 * BOM Manages AWS Modules Dependencies and Fetch all transition Dependencies.
 ```
 <dependencyManagement>
	  <dependencies>
	   <dependency>
	    <groupId>software.amazon.awssdk</groupId>
	    <artifactId>bom</artifactId>
	    <version>2.17.59</version>
	    <type>pom</type>
	    <scope>import</scope>
	   </dependency>
	  </dependencies>
 </dependencyManagement>

 ```
 * Next add required aws Module dependency as per your project needs like S3,EC2, DynamoDB etc.

 ```
	<dependency>
	    <groupId>software.amazon.awssdk</groupId>
	    <artifactId>s3</artifactId>
 </dependency>
 ```
### Connect AWS service S3 with Java
	* Access AWS SDK Client for different services and Implement to build your applcation
	* for example to access S3 service and perfrom various operation with S3 you may use S3Client in you code.

## Resources:
  * [AWS SDK JAVA](https://aws.amazon.com/sdk-for-java/)
  * [AWS SDK for Java API Reference](https://sdk.amazonaws.com/java/api/latest/)
  * [AWS CLI](https://aws.amazon.com/cli/)
  * [AWS CLI install](https://docs.aws.amazon.com/cli/latest/userguide/install-cliv2-windows.html)
  * [AWS CLI Configure](https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-quickstart.html)
  * [AWS SDK Github](https://github.com/aws/aws-sdk-java-v2/#using-the-sdk)
  * [AWS SDK Maven Repository](https://mvnrepository.com/artifact/software.amazon.awssdk/) 
