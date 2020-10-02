package cn.ln.truck.service.account.entity.users;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UsersEntity
{
    private String  id;
    private String name;
    private String password;
    private int active;
}
