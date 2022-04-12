package me.pianorang.cms.admin.portfolio.application.port.in;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class PortfolioDataTableResponse {
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
