package com.demo.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErreur implements ErrorDecoder{
	
	private final ErrorDecoder defaultErrorDecoder = new Default();

	@Override
	public Exception decode(String methodKey, Response response) {
		if(response.status() == 404) {
			return new ProductNotFoundException("Produit non trouvé");
		}
		return defaultErrorDecoder.decode(methodKey, response);
	}

}