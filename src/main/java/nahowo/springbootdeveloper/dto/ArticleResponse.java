package nahowo.springbootdeveloper.dto;

import lombok.Getter;
import nahowo.springbootdeveloper.domain.Article;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
