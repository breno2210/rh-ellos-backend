package sistema_ellos.service;

import org.springframework.stereotype.Service;
import sistema_ellos.dto.FuncionarioDTO;
import sistema_ellos.model.Funcionario;
import sistema_ellos.repository.FuncionarioRepository;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    // ===============================
    // LISTAR TODOS
    // ===============================
    public List<FuncionarioDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    // ===============================
    // SALVAR
    // ===============================
    public FuncionarioDTO salvar(FuncionarioDTO dto) {
        Funcionario funcionario = toEntity(dto);
        Funcionario salvo = repository.save(funcionario);
        return toDTO(salvo);
    }

    // ===============================
    // BUSCAR POR ID
    // ===============================
    public FuncionarioDTO buscarPorId(Long id) {
        Funcionario funcionario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
        return toDTO(funcionario);
    }

    // ===============================
    // ATUALIZAR
    // ===============================
    public FuncionarioDTO atualizar(Long id, FuncionarioDTO dto) {
        Funcionario funcionario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        funcionario.setNome(dto.getNome());
        funcionario.setCargo(dto.getCargo());

        Funcionario atualizado = repository.save(funcionario);
        return toDTO(atualizado);
    }

    // ===============================
    // DELETAR
    // ===============================
    public void deletar(Long id) {
        Funcionario funcionario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        repository.delete(funcionario);
    }

    // ===============================
    // CONVERSÕES
    // ===============================
    private FuncionarioDTO toDTO(Funcionario funcionario) {
        return new FuncionarioDTO(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getCargo()
        );
    }

    private Funcionario toEntity(FuncionarioDTO dto) {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(dto.getId());
        funcionario.setNome(dto.getNome());
        funcionario.setCargo(dto.getCargo());
        return funcionario;
    }
}
