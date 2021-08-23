package com.py.lenovo.Service;

import com.py.lenovo.Bean.DellUserBean;
import com.py.lenovo.pojo.DellUser;
import org.springframework.stereotype.Service;

@Service
public class DellServices {

    public DellUser getService(DellUserBean bean) {
        DellUser pojo = convertBeanToPojo(bean);
        return pojo;
    }
    public DellUser getService() {
        DellUserBean dellService = new DellUserBean();
        DellUser myPojo = new DellUser();
        myPojo.setHandsomeBoy(dellService.getLadka());
        myPojo.setMobileNo(dellService.getLadki());
        return myPojo;
    }
    private DellUser convertBeanToPojo(DellUserBean bean) {
        DellUser pojo = new DellUser();
        pojo.setHandsomeBoy(bean.getLadka());
        pojo.setMobileNo(bean.getLadki());
        return pojo;
    }
}
