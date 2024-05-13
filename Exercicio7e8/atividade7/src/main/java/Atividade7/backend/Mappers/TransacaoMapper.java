package Atividade7.backend.Mappers;

import Atividade7.backend.GettersEsetters.Transacao;
import Atividade7.backend.atividade7.DTOs.TransacaoDTO;
import Atividade7.backend.atividade7.DTOs.TransacaoResponseDTO;

@Mapper
public interface TransacaoMapper {
    TransacaoMapper INSTANCE = Mappers.getMapper(TransacaoMapper.class);

    Transacao toEntity(TransacaoDTO dto);
    TransacaoResponseDTO toResponseDTO(Transacao entity);
}

