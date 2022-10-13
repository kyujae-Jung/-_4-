package com.sparta.week031.dto;

import com.sparta.week031.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

public class BoardResponseDto {
    @Getter
    public static class BoardInfoDto {
        private Long id;
        private String title;
        private String username;
        private String content;
        private LocalDateTime createdAt;
        private LocalDateTime modifiedAt;

        public BoardInfoDto(Board board){
            this.id = board.getId();
            this.title = board.getTitle();
            this.username = board.getUsername();
            this.content = board.getContent();
            this.createdAt = board.getCreatedAt();
            this.modifiedAt = board.getModifiedAt();
        }
    }
}
