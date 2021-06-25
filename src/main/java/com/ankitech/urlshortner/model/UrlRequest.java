package com.ankitech.urlshortner.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UrlRequest {
    private String actualUrl;
}
