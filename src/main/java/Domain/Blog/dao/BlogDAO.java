package Domain.Blog.dao;

import Domain.Blog.Blog;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository

public class BlogDAO {
    JdbcTemplate jdbcTemplate;

    public BlogDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Blog blog(Blog blog) {
        String sql = "INSERT INTO BLOG VALUES (?, ?, ?, ?, ?, ?)";
        int update = jdbcTemplate.update(sql,
                blog.getCategory().getCategoryname()
                , blog.getBlogtext()
                , blog.getTitle()
                , blog.getCreatedate()
                , blog.getUpdatedate(),
                blog.getId());
        return  blog ;
    }
}

