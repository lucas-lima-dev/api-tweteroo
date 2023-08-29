package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserDTO(
    @NotBlank @Size(min = 3, max = 20) String userName,
    @NotNull @NotBlank String avatar
) {
    
}
