package com.example.usermanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "Username is required")
    private String username;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",
            message = "Date of birth should be in yyyy-MM-dd format")
    private String dateOfBirth;
    @Email(message = "Email should be valid")
    private String email;
    @Pattern(
            regexp = "\\d{12}",
            message = "Phone number should be 12 digits (country code + number)"
    )
    private String phoneNumber;
}
