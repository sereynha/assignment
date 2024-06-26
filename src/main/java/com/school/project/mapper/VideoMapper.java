package com.school.project.mapper;

import com.school.project.dto.VideoDto;
import com.school.project.model.Video;
import com.school.project.service.CourseService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {CourseService.class})
public interface VideoMapper {
    @Mapping(target = "course", source = "courseId")
    Video toEntity(VideoDto videoDto);

    @Mapping(target = "courseId", source = "course.id")
    VideoDto toDto(Video video);

}