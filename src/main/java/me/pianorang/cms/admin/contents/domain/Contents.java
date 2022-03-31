package me.pianorang.cms.admin.contents.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor()
public class Contents {
    private Long id;
    private String name;
    private String fileName;
    private String originalFilename;
    private String filePath;
    private String thumbnailPath;
    private Long size;
    private String fileExtension;
    private Integer playTime;
}
