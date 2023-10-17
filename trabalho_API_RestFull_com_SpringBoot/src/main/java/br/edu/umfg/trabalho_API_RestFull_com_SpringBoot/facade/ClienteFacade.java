package br.edu.umfg.trabalho_API_RestFull_com_SpringBoot.facade;

import br.edu.umfg.trabalho_API_RestFull_com_SpringBoot.execute.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ClienteFacade { private static final Map<Integer, Cliente> clientes = new HashMap<>();


    public Cliente criar(Cliente cliente){
        Integer proximoId = clientes.keySet().size() +1;
        cliente.setClientId(proximoId);
        clientes.put(proximoId, cliente);

        return cliente;
    }

    public static List<Cliente> armazenaTodos(){
       return  new ArrayList<>(clientes.values());
    }

    public Cliente getById(Integer clienteId) {
        return clientes.get(clienteId);
    }
}
