package alex.trading.oms.model.mapper;

import org.mapstruct.factory.Mappers;

/**
 * Generated mapstruc converter.
 * Based on an annotation object mapper.
 * Works by creating an interface for a "mapper", annotation processing
 * is used to create the implementation.
 *
 * Conversion between two POJOs
 * Create Mappers to convert both ways.
 */
public interface IJsonMapper {

    IJsonMapper INSTANCE = Mappers.getMapper(IJsonMapper.class);
}
