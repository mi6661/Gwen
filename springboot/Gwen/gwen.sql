-- 创建数据库
CREATE DATABASE IF NOT EXISTS Gwen;


-- 文章表
CREATE TABLE blog_posts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200),
    content LONGTEXT,
    created_at DATETIME,
    updated_at DATETIME
);

-- 插入文章数据
INSERT INTO blog_posts(title, content, created_at, updated_at) 
VALUES ('测试数据1', 'Hello world', '2025-05-07 20:21:23', '2025-05-07 20:21:23');

-- 分类表
CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL
);

-- 插入分类数据
INSERT INTO categories(id, name) VALUES (1, '测试');

-- 中间表（多对多）
CREATE TABLE post_categories (
    post_id INT,
    category_id INT,
    PRIMARY KEY (post_id, category_id),
    FOREIGN KEY (post_id) REFERENCES blog_posts(id),
    FOREIGN KEY (category_id) REFERENCES categories(id)
);

-- 插入关系数据
INSERT INTO post_categories(post_id, category_id) VALUES (1, 1);
