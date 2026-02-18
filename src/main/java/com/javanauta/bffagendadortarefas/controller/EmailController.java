package com.javanauta.bffagendadortarefas.controller;


import com.javanauta.bffagendadortarefas.business.EmailService;
import com.javanauta.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javanauta.bffagendadortarefas.infrastructure.client.EmailClient;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTOResponse dto){
        emailService.enviaEmail(dto);
        return ResponseEntity.ok().build();
    }
}
