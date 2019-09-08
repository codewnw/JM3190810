package com.jm3190810.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ECommerceController {

	@GetMapping("/order/{orderId}/item/{itemId}/view")
	public @ResponseBody String sdmfmklsdlmfls(@PathVariable("orderId") String orderId, @PathVariable("itemId") String itemId){
		return orderId;
	}
}
