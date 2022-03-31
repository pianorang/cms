package me.pianorang.cms.admin.contents.adapter.out.persistence;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contents")
@Data
@AllArgsConstructor
@NoArgsConstructor
class ContentsJpaEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
