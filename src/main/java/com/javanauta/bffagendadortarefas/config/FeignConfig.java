package com.javanauta.bffagendadortarefas.config;

import feign.Request;
import feign.okhttp.OkHttpClient;  // Import do OkHttp para Feign
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();  // Cliente que suporta PATCH, PUT, etc.
    }

    @Bean
    public Request.Options options() {
        // Configura timeouts para evitar falhas em requisições lentas
        return new Request.Options(10_000, 60_000);  // Connect/read timeout em ms
    }
}
