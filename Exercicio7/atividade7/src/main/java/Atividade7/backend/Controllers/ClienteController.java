package Atividade7.backend.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Atividade7.backend.DTOs.ClienteDTO;
import Atividade7.backend.GettersEsetters.Cliente;
import Atividade7.backend.Mappers.ClienteMapper;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private Cliente clienteService;

    @GetMapping("/{nome}")
    public ResponseEntity<ClienteDTO> getClienteByName(@PathVariable String nome) {
        Cliente cliente = clienteService.getClienteByName(nome);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        ClienteDTO clienteDTO = ClienteMapper.INSTANCE.toResponseDTO(cliente);
        return ResponseEntity.ok(clienteDTO);
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> addCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = ClienteMapper.INSTANCE.toEntity(clienteDTO);
        cliente = clienteService.addCliente(cliente);
        ClienteDTO responseDTO = ClienteMapper.INSTANCE.toResponseDTO(cliente);
        return ResponseEntity.ok(responseDTO);
    }
}
