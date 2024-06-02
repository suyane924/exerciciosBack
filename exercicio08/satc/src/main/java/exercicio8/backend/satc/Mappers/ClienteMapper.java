package exercicio8.backend.satc.Mappers;

import exercicio8.backend.satc.GettersEsetters.Cliente;
import exercicio8.backend.satc.DTOs.ClienteResponseDTO;

@Mapper
public interface ClienteMapper {
    String Mappers = null;
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    Cliente toEntity(ClienteResponseDTO dto);
    ClienteResponseDTO toResponseDTO(Cliente entity);
}
