package hello;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.UrlBasedViewResolverRegistration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

  /*  @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	   registry.enableContentNegotiation(new MappingJackson2JsonView());
    	   registry.jsp("/WEB-INF/jsp/",".jsp");
    	   registry.order(1);
    }*/
    
    

  /*  @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {

        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();

        resolvers.add(xmlViewResolver());
        resolvers.add(jsonViewResolver());
        resolvers.add(viewResolver());// jsp view resolver
        resolvers.add(pdfViewResolver());
        resolvers.add(xlsViewResolver());

        resolver.setViewResolvers(resolvers);
        return resolver;
    }*/
    
    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();
        resolvers.add(beanNameViewResolver());
        resolvers.add(internalResourceViewResolver());
        resolver.setViewResolvers(resolvers);
        return resolver;
    }
     
    @Bean
    public BeanNameViewResolver beanNameViewResolver(){
    	BeanNameViewResolver resolver =new BeanNameViewResolver();
		return resolver;	
    }
    
    public InternalResourceViewResolver internalResourceViewResolver(){
    	InternalResourceViewResolver resolver =new InternalResourceViewResolver();
    	resolver.setPrefix("/WEB-INF/.../");
    	resolver.setSuffix(".jsp");
		return resolver;
    	
    }
    
    

    
}

