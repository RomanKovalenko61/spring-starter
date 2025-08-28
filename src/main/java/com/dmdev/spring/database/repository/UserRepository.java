package com.dmdev.spring.database.repository;

import com.dmdev.spring.database.repository.pool.ConnectionPool;

public class UserRepository {

    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
