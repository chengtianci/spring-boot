package com.bocsoft.arguide.service.impl;

import com.bocsoft.arguide.dao.UserDao;
import com.bocsoft.arguide.packet.request.RequestTestPO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bocsoft.arguide.service.IDemoService;


/**
 * @Title DemoServiceImpl
 * @Description 业务层接口--实现
 * @author chengtc
 * @date 2020年07月15日09:01:58
 */
@Service
public class DemoServiceImpl implements IDemoService{
    @Autowired
    private UserDao userDao;

    @Override
    public Object selectByPrimaryKey(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

//    @Override
//    public Object selectByExample(RequestTestPO requestTestPO) {
//        //此处只是举例样例查询
//        return userDao.selectByPrimaryKey((User) requestTestPO);
//    }
}
