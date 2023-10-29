package com.example.springbootblogapplication.controllers;

import com.example.springbootblogapplication.services.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ImageController {
    private final FileService fileService;

    @GetMapping("/images/{id}")
    public Resource getImage(@PathVariable("id") String imageUri) {
        return fileService.load(imageUri);
    }
}
