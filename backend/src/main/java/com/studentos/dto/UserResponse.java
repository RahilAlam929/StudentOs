package com.studentos.dto;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String email,
        String fullName,
        boolean enabled,
        List<String> roles,
        StudentProfileResponse profile,
        Instant createdAt,
        Instant updatedAt
) {
}
