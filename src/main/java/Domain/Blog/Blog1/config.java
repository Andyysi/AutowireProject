package Domain.Blog.Blog1;

import Domain.Blog.Blog;
import Domain.Blog.Category;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;


@Configuration
public class config {


    @Bean
    public Category category() {
        Category category = new Category();
        category.setCategoryname("Idontknow");
        category.setId(56);
        return category;

    }
}
