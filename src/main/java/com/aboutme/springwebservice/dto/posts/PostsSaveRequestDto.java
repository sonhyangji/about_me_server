package com.aboutme.springwebservice.dto.posts;

import com.aboutme.springwebservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 테이블과 매핑되는 Entity 클래스를 Request/ Response 클래스로 사용해서는 안됩니다.
 *  Request와 Response용 DTO는 View를 위한 클래스라 정말 자주 변경이 필요합니다.
 *  View Layer와 DB Layer를 철저하게 역할 분리를 하는게 좋습니다.
 *  Controller에서 결과값으로 여러 테이블을 조인해서 줘야할 경우가 빈번
 */

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
