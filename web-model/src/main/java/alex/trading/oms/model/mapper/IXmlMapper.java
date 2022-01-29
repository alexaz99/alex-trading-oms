package alex.trading.oms.model.mapper;

import alex.trading.oms.model.UserRequestMsg;
import alex.trading.oms.model.lombok.User;

//@Mapper
public interface IXmlMapper {

    //UserXmlMapper INSTANCE = Mappers.getMapper(UserXmlMapper.class);

    UserRequestMsg userToUserCommand(User user);
    User userCommandToUser(UserRequestMsg userRequestMsg);
}
