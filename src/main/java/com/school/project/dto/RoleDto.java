package com.school.project.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;


@Data
public class RoleDto {
    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, example = "user_role")
    @NotNull(message = "Role name can't  be null")
    private String name;
    @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "User Role View")
    private String description;;
    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "Permission can't  be null")
    private Set<Long> permissionsId;
}