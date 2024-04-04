package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for (int i = 0; i < 5; i++) {
            AnimalsCage animalsCage =
                    context.getBean("animalsCage", AnimalsCage.class);
            animalsCage.whatAnimalSay();
        }
    }
}
