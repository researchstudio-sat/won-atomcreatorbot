package won.bot.atomcreator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import won.bot.framework.bot.utils.BotUtils;

@Component
public class AtomCreatorBotApp implements CommandLineRunner {
    public static void main(String[] args) {
        if (!BotUtils.isValidRunConfig()) {
            System.exit(1);
        }
        SpringApplication app = new SpringApplication("classpath:/spring/app/botApp.xml");
        app.setWebEnvironment(false);
        app.run(args);
        // ConfigurableApplicationContext applicationContext = app.run(args);
        // Thread.sleep(5*60*1000);
        // app.exit(applicationContext);
    }

    @Override
    public void run(final String... strings) throws Exception {
    }
}
