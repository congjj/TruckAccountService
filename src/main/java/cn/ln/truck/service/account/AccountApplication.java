package cn.ln.truck.service.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.zhg.demo.mybatis.mapper")
//@MapperScan("cn.ln.truck.service.account.mapper")
public class AccountApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(AccountApplication.class, args);
    }

}
