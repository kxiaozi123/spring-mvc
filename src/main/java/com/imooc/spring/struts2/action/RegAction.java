package com.imooc.spring.struts2.action;

import com.imooc.spring.struts2.service.UserService;
import com.opensymphony.xwork2.Action;

public class RegAction implements Action {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        userService.register();
        return Action.SUCCESS;
    }
}
