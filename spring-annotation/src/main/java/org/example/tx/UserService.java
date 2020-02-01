/**
 * @program SpringBooks
 * @description: UserService
 * @author: mf
 * @create: 2020/02/02 00:03
 */

package org.example.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void insertUser() {
        userDao.insert();
        // 可能还有其他业务逻辑等
        System.out.println("insert success");
        // 故意给个异常
        int i = 10 / 0;
    }
}
