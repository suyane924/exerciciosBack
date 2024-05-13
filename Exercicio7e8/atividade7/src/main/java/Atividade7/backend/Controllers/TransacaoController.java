package Atividade7.backend.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Atividade7.backend.GettersEsetters.Transacao;
import Atividade7.backend.Mappers.TransacaoMapper;
import Atividade7.backend.atividade7.DTOs.TransacaoDTO;
import Atividade7.backend.atividade7.DTOs.TransacaoResponseDTO;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private Transacao transacaoService;

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> addTransacao(@Valid @RequestBody TransacaoDTO transacaoDTO) {
        Transacao transacao = TransacaoMapper.INSTANCE.toEntity(transacaoDTO);
        transacao = transacaoService.addTransacao(transacao);
        TransacaoResponseDTO responseDTO = TransacaoMapper.INSTANCE.toResponseDTO(transacao);
        return ResponseEntity.ok(responseDTO);
    }
}
