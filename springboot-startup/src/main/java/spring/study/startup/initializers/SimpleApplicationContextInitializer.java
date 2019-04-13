package spring.study.startup.initializers;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import spring.study.startup.bean.SimpleBean;

/**
 * Created by Format on 2017/5/1.
 */
public class SimpleApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if(applicationContext instanceof AnnotationConfigServletWebServerApplicationContext) {
            ((AnnotationConfigServletWebServerApplicationContext)applicationContext).getBeanFactory().registerSingleton("testBean", new SimpleBean("id-001", "created by initializer"));
        }
    }
}
