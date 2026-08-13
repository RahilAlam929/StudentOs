package com.studentos.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
public record StudentProfileResponse(
        UUID id,
        String college,
        String course,
        Integer year,
        BigDecimal cgpa,
        Instant createdAt,
        Instant updatedAt
) {
}
