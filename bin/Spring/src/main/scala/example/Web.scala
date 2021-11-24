package example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class Web extends WebMvcConfigurer {

  override def addViewControllers(registry: ViewControllerRegistry): Unit = {
    registry.addViewController("/").setViewName("forward:/home.jsp");
    registry.addViewController("/home").setViewName("forward:/home.jsp");
    registry.addViewController("/about").setViewName("forward:/about.jsp");
    registry.addViewController("/login").setViewName("forward:/login.jsp");
    registry.addViewController("/logout").setViewName("forward:/login.jsp");
    registry.addViewController("/admin").setViewName("forward:/admin.jsp");
    registry.addViewController("/super").setViewName("forward:/super.jsp");
    registry.addViewController("/user").setViewName("forward:/user.jsp");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
  }
}
