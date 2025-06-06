package com.example.idp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @PostMapping("/upload")
    public String uploadDocument(@RequestBody String content) {
        return "Received document for processing.";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Document Service is running!";
    }
}