package com.yogesh.urlshortener.controller;

import com.yogesh.urlshortener.model.ShortenedUrl;
import com.yogesh.urlshortener.service.UrlService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/url")
public class UrlController {
    private final UrlService service;

    public UrlController(UrlService service) {
        this.service = service;
    }

    @PostMapping("/shorten")
    public ShortenedUrl shortenUrl(@RequestParam String originalUrl, @RequestParam String shortCode) {
        return service.shortenUrl(originalUrl, shortCode);
    }

    @GetMapping("/{shortCode}")
    public Optional<ShortenedUrl> getOriginalUrl(@PathVariable String shortCode) {
        return service.getOriginalUrl(shortCode);
    }
}
