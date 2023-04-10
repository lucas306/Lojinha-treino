package com.lojinhatreinamento.controllers;

import com.lojinhatreinamento.dtos.LojinhaSpotDto;
import com.lojinhatreinamento.models.LojinhaTreinamentoModel;
import com.lojinhatreinamento.service.LojinhaSpotService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Lojinha-Spot")
public class LojinhaSpotController {

    final LojinhaSpotService lojinhaSpotService;

    public LojinhaSpotController(LojinhaSpotService lojinhaSpotService) {
        this.lojinhaSpotService = lojinhaSpotService;
    }

    @PostMapping
    public ResponseEntity<Object> saveLojinhaSpot(@RequestBody LojinhaSpotDto lojinhaSpotDto){
        var lojinhaTreinamentoModel = new LojinhaTreinamentoModel();
        BeanUtils.copyProperties(lojinhaSpotDto, lojinhaTreinamentoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(lojinhaSpotService.save(lojinhaTreinamentoModel));
    }
}