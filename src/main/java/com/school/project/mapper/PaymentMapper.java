package com.school.project.mapper;

import com.school.project.dto.PaymentDto;
import com.school.project.model.Payment;
import com.school.project.service.CourseService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {CourseService.class})
public interface PaymentMapper {
    @Mapping(target = "course", source = "coursesId")
    Payment toEntity(PaymentDto paymentDto);

}