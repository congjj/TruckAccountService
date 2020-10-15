package cn.ln.truck.service.account.entity.subjects;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SubjectsEntity
{
    private String id;
    private String usersId;
    private String trucksId;
    private String name;
    private int active;
    private double outIn;
}
