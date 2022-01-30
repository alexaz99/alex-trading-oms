package alex.trading.oms.model.mapper;

import org.mapstruct.factory.Mappers;

public interface IJsonMapper {

    IJsonMapper INSTANCE = Mappers.getMapper(IJsonMapper.class);
}
