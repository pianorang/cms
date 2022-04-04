package me.pianorang.cms.admin.contents.adapter.in.web;

import me.pianorang.cms.admin.common.AdminBaseController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AdminBaseController
@RestController
public class ContentsUploadController {

    @PostMapping("/upload")
    ResponseEntity<?> fileUpload(@RequestParam List<MultipartFile> files){

        files.stream().forEach(f->{

        });

        return ResponseEntity.ok("");
    }
}
