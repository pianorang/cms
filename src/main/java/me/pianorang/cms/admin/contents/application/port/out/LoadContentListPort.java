package me.pianorang.cms.admin.contents.application.port.out;

import me.pianorang.cms.admin.contents.domain.Contents;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LoadContentListPort {
    Page<Contents> loadContentListPort(Pageable pageable);
}
