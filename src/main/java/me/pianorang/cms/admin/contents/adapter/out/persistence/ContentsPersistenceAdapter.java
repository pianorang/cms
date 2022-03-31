package me.pianorang.cms.admin.contents.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import me.pianorang.cms.admin.contents.application.port.out.LoadContentListPort;
import me.pianorang.cms.admin.contents.domain.Contents;
import me.pianorang.cms.common.PersistenceAdapter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@PersistenceAdapter
@RequiredArgsConstructor
class ContentsPersistenceAdapter implements LoadContentListPort {

    private final ContentsRepository contentsRepository;
    private final ContentsMapper contentsMapper;

    @Override
    public Page<Contents> loadContentListPort(Pageable pageable) {
        Page<ContentsJpaEntity> contents = contentsRepository.findAll(pageable);
        return contents.map(c-> contentsMapper.mapToDomainEntity(c));

    }
}
