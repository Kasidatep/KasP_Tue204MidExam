package kasp.int204.tue;

import kasp.int204.tue.utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ListMapper listMapper(){
        return new ListMapper();
    }
}
