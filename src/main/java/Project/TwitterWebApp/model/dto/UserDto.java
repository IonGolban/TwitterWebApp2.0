package Project.TwitterWebApp.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Integer id ;

    private String firstName;

    private String lastName;

}
