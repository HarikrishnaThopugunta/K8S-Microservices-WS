package com.phonepay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PhonePayController {

	@Value("${server.port}")
	private String appPort;

	@GetMapping("/")
	public String getMessage(HttpServletRequest request) {
		return String.format(
				"PhonePay App is healthy app port is [%s] is and requested client [%s] and IP address is [%s] and remote user [%s] and remote port [%s]",
				appPort, request.getRemoteHost(), request.getRemoteAddr(), request.getRemoteUser(),
				request.getRemotePort());
	}

}
