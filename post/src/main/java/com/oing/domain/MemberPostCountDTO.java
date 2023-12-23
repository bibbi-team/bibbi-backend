package com.oing.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MemberPostCountDTO {

    LocalDateTime createdAt;

    long count;
}
