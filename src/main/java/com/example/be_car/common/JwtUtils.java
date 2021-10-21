package com.example.be_car.common;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);
    @Value("${bezkoder.app.jwtSecret}")
    private int jwtSecret;

    @Value("${bezkoder.app.jwtSecret}")
    private int jwtExpirationMs;

}
