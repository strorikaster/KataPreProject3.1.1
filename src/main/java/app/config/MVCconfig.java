package app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
    public class MVCconfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/new").setViewName("new");
        registry.addViewController("/edit").setViewName("edit");
        registry.addViewController("/show").setViewName("show");
    }

//    Properties additionalProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("spring.mvc.hiddenmethod.filter.enabled", "true");
//        return properties;
//    }
}
