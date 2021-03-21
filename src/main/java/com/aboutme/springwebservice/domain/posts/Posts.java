package com.aboutme.springwebservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/* ㄴ>실제 테이블과 매칭될 클래스
    jpa를 사용하면 db 데이터의 수정을 대하는 model 클래스
    - 언더스코어 네이밍(_)으로 이름을 매칭합니다.
 */


@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자의 접근 권한을 protected로 제한
@Getter //  클래스내 모든 필드의 Getter 메소드를 자동생성
@Entity
public class Posts implements Serializable {
    @Id // 해당 테이블의 PK 필드를 나타냅니다.
    @GeneratedValue // PK의 생성 규칙을 나타냅니다. - 자동증가하는 정수형 값이 됩니다.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    // Column 기본값 외에 추가로 변경이 필요한 옵션이 있을경우 사용합니다.
    // 문자열의 경우 VARCHAR(255)가 기본값인데, 사이즈를 500으로 늘리고 싶거나(ex: title),
    // 타입을 TEXT로 변경하고 싶거나(ex: content) 등의 경우에 사용됩니다.

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    @Builder // 생성자 대신
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
