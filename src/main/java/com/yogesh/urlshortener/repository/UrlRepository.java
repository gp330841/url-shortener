// Repository
package com.yogesh.urlshortener.repository;

import com.yogesh.urlshortener.model.ShortenedUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UrlRepository extends JpaRepository<ShortenedUrl, Long> {
    Optional<ShortenedUrl> findByShortCode(String shortCode);
}