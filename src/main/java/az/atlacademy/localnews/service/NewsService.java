package az.atlacademy.localnews.service;

import az.atlacademy.localnews.dao.entity.NewsEntity;
import az.atlacademy.localnews.dto.NewsDto;
import jakarta.persistence.Id;

import java.nio.channels.NonWritableChannelException;
import java.util.List;

public interface NewsService {

    List<NewsDto> getAllNews();

    NewsDto getNewsById(Long id);

    void addNewNews(NewsDto news);

    void updateNews(Long id, NewsDto news);

    void removeNews(Long id);

}
