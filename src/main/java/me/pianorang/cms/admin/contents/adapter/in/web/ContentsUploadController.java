package me.pianorang.cms.admin.contents.adapter.in.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class ContentsUploadController {

    @PostMapping("/sys/upload")
    ResponseEntity<?> fileUpload(@RequestParam List<MultipartFile> files){

        files.stream().forEach(f->{

        });

        return ResponseEntity.ok("");
    }
}
