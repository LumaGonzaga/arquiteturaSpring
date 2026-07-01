package io.github.LumaGonzaga.arquiteturaSpring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public TodoRepository getRepository() {
        return repository;
    }

    public void setRepository(TodoRepository repository) {
        this.repository = repository;
    }
}
