package de.ait_tr.g_37_jp_shop.service.mapping;

import de.ait_tr.g_37_jp_shop.domain.dto.ProductDto;
import de.ait_tr.g_37_jp_shop.domain.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMappingService {
    // Mapper using Mapstuckt

    ProductDto mapEntityToDto(Product entity);

    //  @Mapping(target ="id", expression = "java(new Long(0))")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "active", constant = "true")
    Product mapDtoToEntity(ProductDto dto);

}
