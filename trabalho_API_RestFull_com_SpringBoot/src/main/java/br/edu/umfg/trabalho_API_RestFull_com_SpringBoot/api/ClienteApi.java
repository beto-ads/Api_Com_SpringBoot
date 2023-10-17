package br.edu.umfg.trabalho_API_RestFull_com_SpringBoot.api;

import br.edu.umfg.trabalho_API_RestFull_com_SpringBoot.execute.Cliente;
import br.edu.umfg.trabalho_API_RestFull_com_SpringBoot.facade.ClienteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClienteApi {
   @Autowired
    private ClienteFacade clienteFacade;

   @PostMapping
    @ResponseBody
    public Cliente criar (@RequestBody Cliente cliente){
        return clienteFacade.criar(cliente);
   }

   @GetMapping
   @ResponseBody
   public List<Cliente> armazenaTodos(){
       return ClienteFacade.armazenaTodos();
   }

   @GetMapping( value = " /{id} ")
   @ResponseBody
    public Cliente getById(@PathVariable Integer id){
       return clienteFacade.getById(id);
   }

}
