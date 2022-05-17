package main.dto.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import main.dto.UserLoginDTO;


@Data
public class CheckResponse {

    private boolean result;
    @JsonProperty("user")
    private UserLoginDTO userLoginDTO;


}
