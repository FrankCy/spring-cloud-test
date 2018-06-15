package com.ek.ct.client;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class EurekaClusterClientApplication {

	public static void main(String[] args) throws Exception {

		//创建默认的HttpClients
		CloseableHttpClient httpClient = HttpClients.createDefault();

		//请求自定义次数不服务并发送
		for(int i=0; i<10; i++) {
			// GET方法请求服务
			HttpGet httpGet = new HttpGet("http://localhost:9000/router");

			//获取响应
			HttpResponse response =  httpClient.execute(httpGet);

			//输出结果
			System.out.println("响应结果：" + EntityUtils.toString(response.getEntity()));

		}
	}
}
