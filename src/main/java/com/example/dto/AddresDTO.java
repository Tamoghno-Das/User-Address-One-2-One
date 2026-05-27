package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddresDTO
{
    @NotBlank(message = "City is required")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "City must contain only letters and spaces")
    private String city;
    @NotBlank(message = "State is required")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "State must contain only letters and spaces")
    private String state;
    @NotBlank(message = "Pin code is required")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pin code must be a 6-digit number")
    private  String pin_code;
}
