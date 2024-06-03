package com.school.project.mapper;

import com.school.project.dto.PermissionDto;
import com.school.project.model.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionDto dto);
}
