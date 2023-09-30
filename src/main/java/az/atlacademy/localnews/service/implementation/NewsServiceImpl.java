package az.atlacademy.localnews.service.implementation;

import az.atlacademy.localnews.dto.NewsDto;
import az.atlacademy.localnews.dao.entity.NewsEntity;
import az.atlacademy.localnews.dao.repository.NewsRepository;
import az.atlacademy.localnews.service.NewsService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDateTime.now;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NewsServiceImpl implements NewsService {

    NewsRepository newsRepository;


    @Override
    public List<NewsDto> getAllNews() {
        return this.newsRepository  // List<NewsEntity> newsEntityList
                .findAll()
                .stream()
                .map(entity -> new NewsDto(
                        entity.getTitle(),
                        entity.getNewsContent(),
                        entity.getDateTime()))
                .toList();
    }


    @Override
    public NewsDto getNewsById(Long id) {
        return this.newsRepository.findById(id).map(newsEntity -> new NewsDto(
                newsEntity.getTitle(),
                newsEntity.getNewsContent(),
                newsEntity.getDateTime())
        ).orElse(null);

    }

    @Override
    public void addNewNews(NewsDto news) {
        NewsEntity newsEntity = new NewsEntity();
        newsEntity.setTitle(news.getTitle());
        newsEntity.setNewsContent(news.getNewsContent());
        newsEntity.setDateTime(now());
        this.newsRepository.save(newsEntity);
    }


    @Override
    public void updateNews(Long id, NewsDto news) {
        this.newsRepository.findById(id)
                .ifPresent(newsEntity -> {
                    newsEntity.setTitle(news.getTitle());
                    newsEntity.setNewsContent(news.getNewsContent());
                    newsEntity.setDateTime(now());
                    newsRepository.save(newsEntity);
                });
    }

    @Override
    public void removeNews(Long id) {
        this.newsRepository.findById(id).ifPresent(newsRepository::delete);
        //newsEntity -> newsRepository.delete(newsEntity)
    }
}
