package com.imooc.spring.action;

import com.imooc.spring.entity.User;
import com.imooc.spring.service.UserService;
import com.opensymphony.xwork2.Action;
import lombok.Data;

@Data
public class UserAction implements Action {
    private UserService userService;
    private User user;
    @Override
    public String execute() throws Exception {
        userService.register(user);
        return Action.SUCCESS;
    }
}
