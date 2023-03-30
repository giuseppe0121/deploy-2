package co.develhope.deploy2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {



    @GetMapping("/sum")
    public String sum(){
        Random random = new Random();
        int x = random.nextInt();
        int y = random.nextInt();
        int z = x  +y;
        return x + " + "+ y + " = "+z;
    }

}
