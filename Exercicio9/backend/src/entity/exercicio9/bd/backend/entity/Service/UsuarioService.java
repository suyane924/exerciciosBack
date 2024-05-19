package exercicio9.bd.backend.Service;

import exercicio9.bd.backend.DTOs.UsuarioRequestDTO;
import exercicio9.bd.backend.DTOs.UsuarioResponseDTO;
import exercicio9.bd.backend.entity.Usuario;
import exercicio9.bd.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioResponseDTO criarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setLogin(usuarioRequestDTO.getLogin());
        usuario.setSenha(usuarioRequestDTO.getSenha());
        usuario.setEmail(usuarioRequestDTO.getEmail());
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return convertToResponseDTO(usuarioSalvo);
    }

    public UsuarioResponseDTO obterUsuarioPorId(int id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return null;
        }
        return convertToResponseDTO(usuario);
    }

    public List<UsuarioResponseDTO> listarTodosUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(this::convertToResponseDTO).collect(Collectors.toList());
    }

    public UsuarioResponseDTO atualizarUsuario(int id, UsuarioRequestDTO usuarioRequestDTO) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return null;
        }
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setLogin(usuarioRequestDTO.getLogin());
        usuario.setSenha(usuarioRequestDTO.getSenha());
        usuario.setEmail(usuarioRequestDTO.getEmail());
        Usuario usuarioAtualizado = usuarioRepository.save(usuario);
        return convertToResponseDTO(usuarioAtualizado);
    }

    public void deletarUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

    public List<UsuarioResponseDTO> buscarPorNome(String nome) {
        List<Usuario> usuarios = usuarioRepository.findByNomeContaining(nome);
        return usuarios.stream().map(this::convertToResponseDTO).collect(Collectors.toList());
    }

    private UsuarioResponseDTO convertToResponseDTO(Usuario usuario) {
        UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO();
        usuarioResponseDTO.setCodigo(usuario.getCodigo());
        usuarioResponseDTO.setNome(usuario.getNome());
        usuarioResponseDTO.setLogin(usuario.getLogin());
        usuarioResponseDTO.setEmail(usuario.getEmail());
        return usuarioResponseDTO;
    }
}

