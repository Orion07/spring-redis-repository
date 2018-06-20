package com.orion.domain;


import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("movie")
public class Movie implements Serializable {

    private Long id;

    private String name;

    private Integer rate;

    private Integer year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
