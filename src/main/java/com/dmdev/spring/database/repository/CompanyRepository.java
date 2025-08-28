package com.dmdev.spring.database.repository;

import com.dmdev.spring.database.repository.pool.ConnectionPool;

public class CompanyRepository {

    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
