package com.epam.esm.service.tag;

import com.epam.esm.service.dto.PaginationDto;
import com.epam.esm.service.dto.TagDto;

import java.util.Set;

public interface TagSearchService {
    PaginationDto<TagDto> findAll(Integer page, Integer limit);

    TagDto findById(Long id);

    TagDto findByName(String name);

    TagDto mostPopularUserTag();
}
