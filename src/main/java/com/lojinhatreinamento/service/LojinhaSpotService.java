package com.lojinhatreinamento.service;

import com.lojinhatreinamento.models.LojinhaTreinamentoModel;
import com.lojinhatreinamento.repositories.LojinhaSpotRepositoty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class LojinhaSpotService {
    final
    LojinhaSpotRepositoty lojinhaSpotRepositoty;

    public LojinhaSpotService(LojinhaSpotRepositoty lojinhaSpotRepositoty) {

        this.lojinhaSpotRepositoty = lojinhaSpotRepositoty;
    }

    @Transactional
    public LojinhaTreinamentoModel save(LojinhaTreinamentoModel lojinhaTreinamentoModel) {
        return lojinhaSpotRepositoty.save(lojinhaTreinamentoModel);
    }
}
