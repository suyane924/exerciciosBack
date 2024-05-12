package Atividade7.backend.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Atividade7.backend.Mappers.ClienteMapper;
import Atividade7.backend.atividade7.Cliente;
import Atividade7.backend.atividade7.DTOs.ClienteResponseDTO;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private Cliente clienteService;

    @GetMapping("/{nome}")
    public ResponseEntity<ClienteResponseDTO> getClienteByName(@PathVariable String nome) {
        Cliente cliente = clienteService.getClienteByName(nome);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        ClienteResponseDTO clienteDTO = ClienteMapper.INSTANCE.toResponseDTO(cliente);
        return ResponseEntity.ok(clienteDTO);
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> addCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = ClienteMapper.INSTANCE.toEntity(clienteDTO);
        cliente = clienteService.addCliente(cliente);
        ClienteResponseDTO responseDTO = ClienteMapper.INSTANCE.toResponseDTO(cliente);
        return ResponseEntity.ok(responseDTO);
    }
}
