package com.ankitech.urlshortner.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ApiModel(description = "This is url request")
public class UrlResponse {

    @Id
    @ApiModelProperty(notes = "This is the shortened url", example = "www.asdfjb.ly", required = true)
    private String shortUrl;

    @ApiModelProperty(notes = "This is the long url that is shorten", example = "https://www.codingdojo.com/blog/how-to-start-coding", required = true)
    private String longUrl;
}
