package Domain.Blog;

import lombok.Data;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;


import java.time.Instant;
import java.util.List;

@ToString
@Data


public class Blog {
        @Value("${blog.id}")
        private long id;
        @Value("${blog.title}")
        private String title;
        @Value("${blog.blogtext}")
        private String blogtext;
//        @Autowired
        private Category category;

        private Instant createdate = Instant.now();


        private Instant updatedate = Instant.now();
        private List<String> tags;


}
