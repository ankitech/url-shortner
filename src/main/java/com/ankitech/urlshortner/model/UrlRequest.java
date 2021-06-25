package com.ankitech.urlshortner.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "This is url request")
public class UrlRequest {
    @ApiModelProperty(notes = "This is the long url that you want to shorten", example = "https://www.codingdojo.com/blog/how-to-start-coding", required = true)
    private String actualUrl;
}
