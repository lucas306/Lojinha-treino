package com.lojinhatreinamento.repositories;

import com.lojinhatreinamento.models.LojinhaTreinamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface LojinhaSpotRepositoty extends JpaRepository<LojinhaTreinamentoModel, UUID> {


}
