package org.poseidon.controller.invoke;

import org.apache.commons.httpclient.NameValuePair;
import org.poseidon.util.HttpClientUtil;

public class HttpInvokeMain {
	public static void main(String[] args) throws Exception{
    	NameValuePair[] data = {
    							new NameValuePair("action", "createTestData")
    						   }; 

    	HttpClientUtil.sendPost("http://127.0.0.1:8080/poseidon/downloadAction.do", data, 6000);
    }
}
