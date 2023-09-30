package az.atlacademy.localnews.controller;

import az.atlacademy.localnews.dto.NewsDto;
import az.atlacademy.localnews.service.implementation.NewsServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/manage/news")
public class ManageController {
    private final NewsServiceImpl newsService;

    @PostMapping
    public void addNewNews(@RequestBody NewsDto news) {
        this.newsService.addNewNews(news);
    }

    @PatchMapping("{id}")
    public void updateNews(@PathVariable Long id, @RequestBody NewsDto news) {
        this.newsService.updateNews(id, news);
    }

    @DeleteMapping("{id}")
    public void removeNews(@PathVariable Long id) {
        this.newsService.removeNews(id);
    }

}
