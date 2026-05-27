package br.com.faculdadedonaduzzi.lab;

import br.com.faculdadedonaduzzi.lab.controller.TarefaController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class TaskControllerTest {

    @Autowired
    private TarefaController tarefaController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(tarefaController).build();
    }

    @Test
    public void testGetAllTasks() throws Exception {
        // O ERRO INTENCIONAL ESTÁ AQUI: Chamando "/tarefa" em vez de "/tarefas"
        mockMvc.perform(get("/tarefa"))
               .andExpect(status().isOk());
    }
}
