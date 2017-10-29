package is.ru.ticTacToe;

import com.github.springfox.loader.EnableSpringfox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;;

@EnableSpringfox
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        /*ApplicationDB db = new ApplicationDB();
        db.connect();
        db.initDB();
        db.addGameResult("x", 10);*/
    }
}
