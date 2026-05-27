package com.example.dto;

import com.example.entity.Address;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserssDTO
{
    @NotBlank(message = "Full name is required")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Full name must contain only letters and spaces")
    private String fullname;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[6-9][0-9]{10}$", message = "Invalid Indian Phone number")
    private String phone;
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Max age is 60")
    private Integer age;
    @Valid
    private AddresDTO address;
}
