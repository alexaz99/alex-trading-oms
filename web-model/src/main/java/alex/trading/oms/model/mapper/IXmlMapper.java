package alex.trading.oms.model.mapper;

import alex.trading.oms.model.UserRequestMsg;
import alex.trading.oms.model.lombok.User;
import alex.trading.oms.model.xml.UserCommand;
import org.mapstruct.factory.Mappers;

//@Mapper
public interface IXmlMapper {

    IXmlMapper INSTANCE = Mappers.getMapper(IXmlMapper.class);

    UserRequestMsg userToUserRequestMsg(User user);
    User userRequestMsgToUser(UserRequestMsg userRequestMsg);


    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);

}
