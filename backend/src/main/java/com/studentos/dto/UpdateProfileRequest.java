package com.studentos.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.math.BigDecimal;

public record UpdateProfileRequest(
        @Size(max = 255) String fullName,
        @Size(max = 255) String college,
        @Size(max = 255) String course,
        @Min(1) @Max(10) Integer year,
        @Min(0) @Max(10) BigDecimal cgpa
) {
}
