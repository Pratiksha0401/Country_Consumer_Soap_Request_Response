package com.countries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.countries.client.CountryClient;
import com.countries.wsdlClasses.GetCountryRequest;
import com.countries.wsdlClasses.GetCountryResponse;
import com.countries.wsdlClasses.ObjectFactory;

@SpringBootApplication
@Endpoint
public class CountrriesWsdlConsumer1XMlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountrriesWsdlConsumer1XMlApplication.class, args);
	}
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CountryClient client;
	
    @ResponsePayload
    @PayloadRoot(namespace = "http://io/guides/producing-web-service", localPart = "getCountryRequest")
    public GetCountryResponse getCountryDetails(@RequestPayload GetCountryRequest request){
        //logger.info("Request received for countriy details with input "+input);
        //ObjectFactory objectFactory = new ObjectFactory();
        GetCountryResponse output = client.getCountry(request);
        return output;
    }

}
