package com.ankitech.urlshortner.repository;

import com.ankitech.urlshortner.model.UrlResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends CrudRepository<UrlResponse, String> {
}
