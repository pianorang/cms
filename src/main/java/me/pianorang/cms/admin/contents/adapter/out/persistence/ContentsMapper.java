package me.pianorang.cms.admin.contents.adapter.out.persistence;

import me.pianorang.cms.admin.contents.domain.Contents;
import org.springframework.stereotype.Component;

@Component
class ContentsMapper {
    Contents mapToDomainEntity(ContentsJpaEntity contents){
        return new Contents(contents.getId(),
                contents.getName(),contents.getFileName(),
                contents.getOriginalFilename(),contents.getFilePath(),
                contents.getThumbnailPath(),contents.getSize(),
                contents.getFileExtension(),contents.getPlayTime()
                );
    }
}
