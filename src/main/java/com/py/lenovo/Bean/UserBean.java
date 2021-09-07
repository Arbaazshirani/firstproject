package com.py.lenovo.Bean;

import com.py.lenovo.pojo.Company;
import com.py.lenovo.pojo.Laptop;
import com.py.lenovo.pojo.LaptopParts;
import lombok.Data;

@Data
public class UserBean {

    public String members;
    public Integer age;
    public Long mobile;
    public Long tarikh;
    private Company company;
}
