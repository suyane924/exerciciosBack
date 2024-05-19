package Atividade7.backend.Mappers;

import Atividade7.backend.DTOs.ClienteDTO;
import Atividade7.backend.GettersEsetters.Cliente;

@Mapper
public interface ClienteMapper {
    String Mappers = null;
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    Cliente toEntity(ClienteDTO dto);
    ClienteDTO toResponseDTO(Cliente entity);
}
