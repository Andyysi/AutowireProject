package Domain.Blog;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BlogProject1Application {
//    @Autowired
//    private Blog blog;

    public static void main(String[] args) {
       // ApplicationContext =
        SpringApplication.run(BlogProject1Application.class, args);
    //    Blog blog = applicationContext.getBean(Blog.class);
     //   System.out.println("blog = " + blog);

    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
 //           System.out.println(blog);
        };
    }

}
