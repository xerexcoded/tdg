package com.example.tdg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ClientController {
public  static  final String URL = "https://localhost:8443/hello";
@Autowired
private RestTemplate restTemplate;


}
