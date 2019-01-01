package com.onexo.tpa.tpasys.service;

import com.onexo.tpa.tpasys.model.UserModel;
import com.onexo.tpa.tpasys.service.impl.IUserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsService implements IUserDetailsService {
    private List<UserModel> userList = new ArrayList<>();

    @Override
    public List<UserModel> getUserList() {
        UserModel user = new UserModel.Builder()
                .setUserId(1)
                .setDepartment("FMA")
                .setUsername("Dushyant")
                .setPassword("Dushyant")
                .build();
        userList.add(user);
        return userList;
    }



}
