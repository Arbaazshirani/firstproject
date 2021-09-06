package com.py.lenovo.Service;

import com.py.lenovo.Bean.UserBean;
import com.py.lenovo.pojo.Company;
import com.py.lenovo.pojo.User;
import com.py.lenovo.repository.CompanyRepository;
import com.py.lenovo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public List<UserBean> getRecords()   {
        List<User> recordsFromDatabase = userRepository.findAll();
        List<UserBean> responseToRequestor = new ArrayList<>();
        for (User record : recordsFromDatabase) {
            UserBean temporary = convertPojoToBean(record);
            responseToRequestor.add(temporary);
        }
        return responseToRequestor;
    }

    public UserBean getRecordsByName(String name)   {
        User record = userRepository.findByEmployee(name);
        UserBean response = new UserBean();
        //if (record != null) {
            response = convertPojoToBean(record);
        //}
        return response;
    }

    public List<UserBean> getRecordsByAge(Integer age){
        List<User> mob = userRepository.findByAge(age);
        List<UserBean> record = new ArrayList<>();
        for (User records: mob){
            UserBean tem = convertPojoToBean(records);
            record.add(tem);
        }
        return record;
    }

    public List<UserBean> getRecordsByMobileNo(Long mobile){
        List<User> mob = userRepository.findByMobileNo(mobile);
        List<UserBean> record = new ArrayList<>();
        for (User records: mob){
            UserBean tem = convertPojoToBean(records);
            record.add(tem);
        }
        return record;
    }

    public HashMap<Integer, String> getNameAgeHashMap(){
        List<User> records = userRepository.findAll();
        HashMap<Integer, String> response = new HashMap<>();
        for (User record: records){
            response.put(record.getAge(), record.getEmployee());
        }
        return response;
    }

    @Autowired
    CompanyRepository companyRepository;
    public User addRecord(UserBean bean) {
        Company company = bean.getCompany();
        companyRepository.save(company);
        User pojo;
        pojo = convertBeanToPojo(bean);
        pojo.setCompany(company);
        userRepository.save(pojo);
        return pojo;
    }

    private UserBean convertPojoToBean(User pojorecord) {
        UserBean response = new UserBean();
        response.setMembers(pojorecord.getEmployee());
        response.setAge(pojorecord.getAge());
        response.setMobile(pojorecord.getMobileNo());
        response.setTarikh(pojorecord.getDate().getTime());
        response.setCompany(pojorecord.getCompany());
        return response;
    }


    private User convertBeanToPojo(UserBean bean) {
        User user = new User();
        user.setEmployee(bean.getMembers());
        user.setAge(bean.getAge());
        user.setMobileNo(bean.getMobile());
        user.setDate(new Date(bean.getTarikh()));
        return user;
    }

    public User updaterecord(Long id, User pojo){
        User updatepojo = userRepository.findByRecordId(id);
        updatepojo.setAge(pojo.getAge());
        updatepojo.setDate(pojo.getDate());
        updatepojo.setEmployee(pojo.getEmployee());
        updatepojo.setMobileNo(pojo.getMobileNo());
        return userRepository.save(updatepojo);
    }

    public User deletingRecord(Long deleting){
        User record = userRepository.findByRecordId(deleting);
        userRepository.deleteById(deleting);
        return record;
    }

    public User MarkAsRecord(Long id){
        Optional<User> record = userRepository.getById(id);
        User tempRecord = new User();
        tempRecord.setMobileNo(record.get().getMobileNo());
        tempRecord.setEmployee(record.get().getEmployee());
        tempRecord.setAge(record.get().getAge());
        tempRecord.setDate(record.get().getDate());
        tempRecord.setRecordId(record.get().getRecordId());
        tempRecord.setDeleted(Boolean.TRUE);
        userRepository.save(tempRecord);
        return tempRecord;
    }

    public List<Company> getAnotherTableRecord(){
       List<Company> anotherTable = companyRepository.findAll();
       return  anotherTable;
    }
}

