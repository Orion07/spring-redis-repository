package com.orion.config;

import org.springframework.data.redis.core.index.IndexConfiguration;
import org.springframework.data.redis.core.index.IndexDefinition;
import org.springframework.data.redis.core.index.SimpleIndexDefinition;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.Collections;

@EnableRedisRepositories(indexConfiguration = RedisConfiguration.MovieIndexConfiguration.class)
public class RedisConfiguration {

    public static class MovieIndexConfiguration extends IndexConfiguration {

        @Override
        protected Iterable<? extends IndexDefinition> initialConfiguration() {
            return Collections.singleton(new SimpleIndexDefinition("movie", "year"));
        }
    }
}
