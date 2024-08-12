package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //생성자 상단에 선언 시 생성자에 포함된 빌드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
        //세터 메소드가 없다. Entity 클래스에서는 절대 Setter 메소드를 만들지 않는다.
        // db에 삽입할때는 해당 이벤트에 맞는 public 메소드를 호출하여 변경하는것을 전제로 한다.
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
