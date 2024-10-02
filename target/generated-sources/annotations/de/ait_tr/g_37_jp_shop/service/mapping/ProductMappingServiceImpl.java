package de.ait_tr.g_37_jp_shop.service.mapping;

import de.ait_tr.g_37_jp_shop.domain.dto.ProductDto;
import de.ait_tr.g_37_jp_shop.domain.entity.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T22:11:35+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class ProductMappingServiceImpl implements ProductMappingService {

    @Override
    public ProductDto mapEntityToDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( entity.getId() );
        productDto.setTitle( entity.getTitle() );
        productDto.setPrice( entity.getPrice() );

        return productDto;
    }

    @Override
    public Product mapDtoToEntity(ProductDto dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setTitle( dto.getTitle() );
        product.setPrice( dto.getPrice() );

        product.setId( new Long(0) );
        product.setActive( true );

        return product;
    }
}
