package alex.trading.oms.model.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * All objects will be generated by jaxb
 */
public class XmlTemplateObject {

    public static void main(String[] args) {
        UserCommand userCommand = new ObjectFactory().createUserCommand();
        userCommand.setEmail("az@yahoo.com");
        userCommand.setFirstName("Bob");
        userCommand.setLastName("Tester");
        System.out.println(userCommand);

        /*try {
            JAXBContext jaxbContext = JAXBContext.newInstance(userCommand.getClass());
        } catch (JAXBException e) {
            e.printStackTrace();
        }*/

        //jaxbObjectToXML(userCommand);
    }

    private static void jaxbObjectToXML(UserCommand userCommand)
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(UserCommand.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // Required formatting to format XML
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Store XML to File
            //File file = new File("employee.xml");

            // Writes XML file to file-system
            //jaxbMarshaller.marshal(userCommand, file);

            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(userCommand, sw);
            //jaxbMarshaller.marshal(userCommand, System.out);

            String result = sw.toString();
            System.out.println(result);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
