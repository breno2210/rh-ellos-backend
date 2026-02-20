package sistema_ellos.controller;

import org.springframework.web.bind.annotation.*;
import sistema_ellos.dto.FuncionarioDTO;
import sistema_ellos.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    // ===============================
    // GET - LISTAR TODOS
    // ===============================
    @GetMapping
    public List<FuncionarioDTO> listar() {
        return service.listarTodos();
    }

    // ===============================
    // GET - BUSCAR POR ID
    // ===============================
    @GetMapping("/{id}")
    public FuncionarioDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // ===============================
    // POST - CRIAR
    // ===============================
    @PostMapping
    public FuncionarioDTO criar(@RequestBody FuncionarioDTO dto) {
        return service.salvar(dto);
    }

    // ===============================
    // PUT - ATUALIZAR
    // ===============================
    @PutMapping("/{id}")
    public FuncionarioDTO atualizar(@PathVariable Long id,
                                     @RequestBody FuncionarioDTO dto) {
        return service.atualizar(id, dto);
    }

    // ===============================
    // DELETE - REMOVER
    // ===============================
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
