package com.studentos.dto;

import com.studentos.entity.StudentProfile;
import com.studentos.entity.User;

import java.util.Comparator;
import java.util.List;

public final class UserMapper {

    private UserMapper() {
    }

    public static UserResponse toResponse(User user) {
        StudentProfile profile = user.getStudentProfile();
        StudentProfileResponse profileResponse = profile == null ? null : new StudentProfileResponse(
                profile.getId(),
                profile.getCollege(),
                profile.getCourse(),
                profile.getYear(),
                profile.getCgpa(),
                profile.getCreatedAt(),
                profile.getUpdatedAt()
        );

        List<String> roles = user.getRoles().stream()
                .map(role -> role.getName().name())
                .sorted(Comparator.naturalOrder())
                .toList();

        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getFullName(),
                user.isEnabled(),
                roles,
                profileResponse,
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }
}
