package com.example.datn.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryRequest {

    Integer id;

    @NotBlank(message = "Category code is required")
    String categoryCode;

    @NotBlank(message = "Category name is required")
    String categoryName;

    String description;
}
