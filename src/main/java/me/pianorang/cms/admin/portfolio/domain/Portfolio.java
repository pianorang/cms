package me.pianorang.cms.admin.portfolio.domain;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Portfolio {
    private Long id;
    private String title;
    private String content;
    private String thumbnailPath;
    private String filePath;
    private String description;
    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime modifiedOn;
    private String modifiedBy;

}
