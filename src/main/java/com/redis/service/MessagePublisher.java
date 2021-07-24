package com.redis.service;

public interface MessagePublisher {
    void publish(final String message);
}
