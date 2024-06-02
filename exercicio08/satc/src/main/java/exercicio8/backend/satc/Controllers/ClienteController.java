package exercicio8.backend.satc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exercicio8.backend.satc.DTOs.ClienteResponseDTO;
import exercicio8.backend.satc.GettersEsetters.Cliente;
import exercicio8.backend.satc.Mappers.ClienteMapper;
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
    public ResponseEntity<ClienteResponseDTO> addCliente(@Valid @RequestBody ClienteResponseDTO clienteDTO) {
        Cliente cliente = ClienteMapper.INSTANCE.toEntity(clienteDTO);
        cliente = clienteService.addCliente(cliente);
        ClienteResponseDTO responseDTO = ClienteMapper.INSTANCE.toResponseDTO(cliente);
        return ResponseEntity.ok(responseDTO);
    }
}