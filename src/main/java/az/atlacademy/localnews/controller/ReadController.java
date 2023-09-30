package az.atlacademy.localnews.controller;

import az.atlacademy.localnews.dto.NewsDto;
import az.atlacademy.localnews.service.implementation.NewsServiceImpl;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/read/news")
public class ReadController {

    private final NewsServiceImpl newsService;

    @GetMapping()
    public List<NewsDto> getAllNews() {
        return this.newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public NewsDto getNewsById(@PathVariable Long id) {
        return this.newsService.getNewsById(id);
    }
}