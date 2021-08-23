package com.py.lenovo.Controller;

import com.py.lenovo.Bean.DellUserBean;
import com.py.lenovo.Service.DellServices;
import com.py.lenovo.pojo.DellUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@Api(description = "This Api is used for testing")
public class DellControllers {

    @Autowired
    private DellServices dellServices;

    @ApiOperation(value = "used to add record to databased")
    @GetMapping("/getRecord")
    public DellUser getDellService() {
        DellUser response = dellServices.getService();
        return response;
    }

    @ApiOperation(value = "Used to convert bean to pojo", notes = "Arbaz shirani")
    @PostMapping("/")
    public DellUser addRecord(@RequestBody DellUserBean bean){
        return dellServices.getService(bean);
    }

}