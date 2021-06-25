package com.ankitech.urlshortner.controller;

import com.ankitech.urlshortner.model.UrlRequest;
import com.ankitech.urlshortner.model.UrlResponse;
import com.ankitech.urlshortner.service.UrlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Validated
@Api(value = "Url Controller")
@RequestMapping("/v1/url/")
public class UrlController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getClass());

    private UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @ApiOperation(value = "Create a short url for the given long url",
                    response = UrlResponse.class, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping
    public UrlResponse getUrlV1(@RequestBody UrlRequest urlRequest) {

        return urlService.shortenUrl(urlRequest);
    }
}
