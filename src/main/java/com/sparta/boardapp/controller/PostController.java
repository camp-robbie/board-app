package com.sparta.boardapp.controller;

import com.sparta.boardapp.dto.PostAddRequestDto;
import com.sparta.boardapp.dto.PostResponseDto;
import com.sparta.boardapp.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostResponseDto addPost(
            @RequestBody PostAddRequestDto requestDto
    ) {
        PostResponseDto responseDto = postService.addPost(requestDto);
        return responseDto;
    }

    @GetMapping("/{postId}")
    public PostResponseDto getPost(
            @PathVariable Long postId
    ) {
        return postService.getPost(postId);
    }


}
