package cn.ln.truck.service.account.entity.users;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginEntity
{
    private String userId;
    private String Password;
}
