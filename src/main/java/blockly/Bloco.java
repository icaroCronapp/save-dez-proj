package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@RestController
@CronappSwagger
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade<app.entity.Teste>
 *
 * @author Ícaro Antunes
 * @since 18/10/2023, 15:35:06
 *
 */
@RequestMapping(path = "/api/cronapi/rest/Bloco:Executar", method = RequestMethod.GET, consumes = "*/*")
public static Var Executar(@ParamMetaData(description = "Entidade", id = "adf8c771") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
Var.valueOf(
cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("sigla")).getObjectAsString() +
Var.valueOf(" - ").getObjectAsString() +
cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("name")).getObjectAsString());
   }
 }.call();
}

}

