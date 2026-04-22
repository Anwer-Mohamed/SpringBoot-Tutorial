package com.global.tutorial.Officer.Erorr;

import java.util.Arrays;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.webmvc.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

@Component
public class CustomjErorrAttribute extends DefaultErrorAttributes{

	public CustomjErorrAttribute() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Map<String, @Nullable Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
		
		
		Map<String, @Nullable Object> errorAttributes = 
				super.getErrorAttributes(webRequest, options);
		
		errorAttributes.put("success",Boolean.FALSE);
		errorAttributes.put("status",errorAttributes.get("error"));
		errorAttributes.put("exception",errorAttributes.get("message"));
		errorAttributes.put("details",Arrays.asList(errorAttributes.get("message")));
		errorAttributes.remove("error");
		errorAttributes.remove("path");
		
		return errorAttributes;
	}

}
