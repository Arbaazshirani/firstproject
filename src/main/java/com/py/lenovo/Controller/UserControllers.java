package com.py.lenovo.Controller;

import com.py.lenovo.Bean.UserBean;
import com.py.lenovo.Service.UserService;
import com.py.lenovo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(description = "This Api is used for testing")
public class UserControllers {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Used to fetch all data from database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @GetMapping("/getRecord")
    public List<UserBean> getRecords() {
        List<UserBean> response = userService.getRecords();
        return response;
    }

    @ApiOperation(value = "Used to fetch records by Age from database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @GetMapping("/getRecordsByAge/{age}")
    public List<UserBean> getRecordsByAge(@PathVariable("age") Integer age){
        return userService.getRecordsByAge(age);
    }

    @ApiOperation(value = "Used to fetch records by Mobile No from database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @GetMapping("/getRecordByMobileNo/{mobile}/{age}")
    public List<UserBean> getDellService(@PathVariable("mobile") Long mobile) {
        List<UserBean> response = userService.getRecordsByMobileNo(mobile);
        return response;
    }

    @ApiOperation(value = "Used to fetch record Hash Map from database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @GetMapping("/getNameAgeHashMap")
    public HashMap<Integer, String> getNameAgeHashMap(){
        return userService.getNameAgeHashMap();
    }

    @ApiOperation(value = "Used to Add record to database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @PostMapping("/")
    public User addRecord(@RequestBody UserBean bean){
        return userService.addRecord(bean);
    }

    @ApiOperation(value = "Used to update record in database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @PutMapping("/updateRecord/{update}")
    public User updateRecord(@PathVariable("update")Long xyz,@RequestBody User abc){
        return userService.updaterecord(xyz, abc);
    }

    @ApiOperation(value = "Used to delete record in database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @DeleteMapping("/requestDelete/{delete}")
    public User deleteRecord(@PathVariable("delete") Long deleting){
        return userService.deletingRecord(deleting);
    }

    @ApiOperation(value = "Used to mark as delete record in database",
            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
    @DeleteMapping("/requestMarkAsDelete/{markAsDelete}")
    public void deleteAsMark(@PathVariable("markAsDelete") Long MarkDelete) {
        userService.MarkAsRecord(MarkDelete);
    }

//    @ApiOperation(value = "Used to One to One relationship in database",
//            notes = "Status: *Completed* \nRequired Fields: ** \nOptional Fields: **\nComment: **")
//    @PostMapping("/")
//    public String oneToOneMapping(@RequestBody Company pojo){
//        return userService.one(pojo);
//    }
}