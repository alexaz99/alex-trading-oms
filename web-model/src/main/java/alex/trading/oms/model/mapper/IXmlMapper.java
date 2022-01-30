package alex.trading.oms.model.mapper;

import alex.trading.oms.model.UserRequestMsg;
import alex.trading.oms.model.lombok.User;
import alex.trading.oms.model.xml.UserCommand;

//@Mapper
public interface IXmlMapper {

    //UserXmlMapper INSTANCE = Mappers.getMapper(UserXmlMapper.class);

    UserRequestMsg userToUserRequestMsg(User user);
    User userRequestMsgToUser(UserRequestMsg userRequestMsg);


    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);

}
