package com.ankitech.urlshortner.service.implementation;

import com.ankitech.urlshortner.model.UrlRequest;
import com.ankitech.urlshortner.model.UrlResponse;
import com.ankitech.urlshortner.repository.UrlRepository;
import com.ankitech.urlshortner.service.UrlService;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImp implements UrlService {

    private UrlRepository urlRepository;

    public UrlServiceImp(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Override
    public UrlResponse shortenUrl(UrlRequest request) {

        //Generate short url and persist
        String shortUrl = "Dummy";


        return urlRepository.save(UrlResponse.builder()
                .shortUrl(shortUrl)
                .longUrl(request.getActualUrl())
                .build());
    }
}
