package haiming;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
}

 * 开启CAS @EnableCasClient
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableCasClient
public class FdSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdSysApplication.class, args);
    }
}
