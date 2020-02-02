/**
 * @program SpringBooks
 * @description: UserService
 * @author: mf
 * @create: 2020/02/02 23:28
 */

package org.example.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event) {
        System.out.println("UserService" + event);
    }
}
