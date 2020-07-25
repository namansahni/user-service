package com.naman.oj.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private Long id;

    private String fullName;

    private String email;

    private boolean active; // dikhane k liye

    public UserResponseDto(Long id, String fullName, String email, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.active = active;
    }
}
