// Service
package com.yogesh.urlshortener.service;

import com.yogesh.urlshortener.model.ShortenedUrl;
import com.yogesh.urlshortener.repository.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlService {
    private final UrlRepository repository;
    
    public UrlService(UrlRepository repository) {
        this.repository = repository;
    }
    
    public ShortenedUrl shortenUrl(String originalUrl, String shortCode) {
        ShortenedUrl url = new ShortenedUrl(null, originalUrl, shortCode);
        return repository.save(url);
    }
    
    public Optional<ShortenedUrl> getOriginalUrl(String shortCode) {
        return repository.findByShortCode(shortCode);
    }
}