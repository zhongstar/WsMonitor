package com.ws.stoner.listener;

import com.ws.bix4j.ZApi;
import com.ws.bix4j.ZApiException;
import com.ws.bix4j.access.user.UserLogoutRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by chenzheqi on 2017/5/5.
 */
@Component
public class SessionListener implements HttpSessionListener{
    private static final Logger logger = LoggerFactory.getLogger(SessionListener.class);
    @Autowired
    private ZApi zApi;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        logger.debug("session created {}", httpSessionEvent.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        try {
            zApi.User().logout(new UserLogoutRequest());
        } catch (ZApiException e) {
            e.printStackTrace();
            if(e.getMessage().contains("API")) {
                logger.error("zabbix logout failure");
            }
        }
        logger.debug("session destroyed {}", httpSessionEvent.getSession().getId());
    }
}
