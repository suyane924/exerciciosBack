package Atividade7.backend.Mappers;

import Atividade7.backend.atividade7.Cliente;
import Atividade7.backend.atividade7.DTOs.ClienteDTO;
import Atividade7.backend.atividade7.DTOs.ClienteResponseDTO;

@Mapper
public interface ClienteMapper {
    String Mappers = null;
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    Cliente toEntity(ClienteDTO dto);
    ClienteResponseDTO toResponseDTO(Cliente entity);
}
