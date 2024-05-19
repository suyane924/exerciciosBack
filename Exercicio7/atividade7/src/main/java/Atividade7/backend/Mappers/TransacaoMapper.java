package Atividade7.backend.Mappers;

import Atividade7.backend.DTOs.TransacaoDTO;
import Atividade7.backend.GettersEsetters.Transacao;

@Mapper
public interface TransacaoMapper {
    TransacaoMapper INSTANCE = Mappers.getMapper(TransacaoMapper.class);

    Transacao toEntity(TransacaoDTO dto);
    TransacaoDTO toResponseDTO(Transacao entity);
}

