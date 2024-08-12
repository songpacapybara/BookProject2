package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {

    //인터페이스를 생성후, JpaRepository<Entity class, PK타입> 상속하면 기본적인 CURD 메소드가 자동으로 생성된다.
}
