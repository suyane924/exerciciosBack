package exercicio8.backend.satc.Mappers;


import exercicio8.backend.satc.GettersEsetters.Transacao;
import exercicio8.backend.satc.DTOs.TransacaoDTO;
import exercicio8.backend.satc.DTOs.TransacaoResponseDTO;

@Mapper
public interface TransacaoMapper {
    TransacaoMapper INSTANCE = Mappers.getMapper(TransacaoMapper.class);

    Transacao toEntity(TransacaoDTO dto);
    TransacaoResponseDTO toResponseDTO(Transacao entity);
}

