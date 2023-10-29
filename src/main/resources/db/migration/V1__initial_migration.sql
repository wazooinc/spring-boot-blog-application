CREATE TABLE IF NOT EXISTS post
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id),
    title VARCHAR(255) NOT NULL,
    body VARCHAR(5000),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    account_id BIGINT NOT NULL
);

CREATE TABLE IF NOT EXISTS authority
(
    name VARCHAR(16) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS account
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(id),
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS account_authority
(
    account_id BIGINT,
    PRIMARY KEY(account_id),
    authority_name VARCHAR(16)
);
