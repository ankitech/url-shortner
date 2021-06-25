package com.ankitech.urlshortner.service;

import com.ankitech.urlshortner.model.UrlRequest;
import com.ankitech.urlshortner.model.UrlResponse;

public interface UrlService {
    UrlResponse shortenUrl(UrlRequest request);
}
