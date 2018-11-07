package br.com.swagger.main;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "teste1", description = "operations with teste1 controller")
@RestController
@RequestMapping("test/")
public class Controller1 {


    @ApiOperation(value="used tu post the 'teste1' methods", response = EntityProduct.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retornado com sucesso"),
        @ApiResponse(code = 401, message = "Não autorizado"),
        @ApiResponse(code = 403, message = "Acesso proibido"),
        @ApiResponse(code = 404, message = "Recurso não encontrado")})
    @GetMapping(value="teste1", produces = "application/json")
    public EntityProduct methodOne() {
        EntityProduct entidade = new EntityProduct();
        entidade.setPropert1("testes de propriedade");
        entidade.setPropert2("testes de propriedade");
        return entidade;
    }

    @GetMapping("teste1.1")
    @ResponseBody
    public EntityProduct methodTwo() {
        return new EntityProduct();
    }
}