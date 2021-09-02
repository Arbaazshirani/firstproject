package com.py.lenovo.Bean;

import com.py.lenovo.pojo.Company;
import lombok.Data;

@Data
public class UserBean {

    public String members;
    public Integer age;
    public Long mobile;
    public Long tarikh;
    private Company company;


}
