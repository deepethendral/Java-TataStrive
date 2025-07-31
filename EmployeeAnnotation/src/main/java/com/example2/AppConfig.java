package com.example2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example2")  // 👈 Must match your package name exactly!
public class AppConfig {
}
