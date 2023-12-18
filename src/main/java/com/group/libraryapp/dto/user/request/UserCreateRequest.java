package com.group.libraryapp.dto.user.request;

import lombok.Getter;

@Getter
public class UserCreateRequest {
    private String name;
    private Integer age; //int는 null을 표현할 수 없고, Integer는 null을 표현할 수 있다.
}
