package exercicio8.backend.satc.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import exercicio8.backend.satc.DTOs.TransacaoDTO;
import exercicio8.backend.satc.DTOs.TransacaoResponseDTO;
import exercicio8.backend.satc.GettersEsetters.Transacao;
import exercicio8.backend.satc.Mappers.TransacaoMapper;
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

