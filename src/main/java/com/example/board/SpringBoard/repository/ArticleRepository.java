package com.example.board.SpringBoard.repository;

import com.example.board.SpringBoard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
