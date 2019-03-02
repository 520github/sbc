package com.codingapi.tm.framework.utils;

import com.codingapi.tm.Constants;
import io.netty.channel.Channel;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Title:SocketManager
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/20下午7:15
 * @m444@126.com
 */
public class SocketManager {

    private int maxConnection = Constants.maxConnection;
    private int nowConnection;
    private boolean allowConnection = true;

    private List<Channel> clients = null;
    private Map<String, String> lines = null;

    private static SocketManager manager = null;

    private SocketManager() {
        clients = new CopyOnWriteArrayList<>();
        lines = new ConcurrentHashMap<>();
    }

    public static SocketManager getInstance() {
        if(manager == null) {
            synchronized (SocketManager.class) {
                if(manager == null) {
                    manager = new SocketManager();
                }
            }
        }
        return manager;
    }

    public Channel getChannelByModeName(String name) {
        for(Channel channel: clients) {
            String modelName = channel.remoteAddress().toString();
            if(modelName.equals(name)) {
                return channel;
            }
        }
        return null;
    }

    public void removeClient(Channel client) {
        clients.remove(client);
        nowConnection = clients.size();
        allowConnection = (maxConnection != nowConnection);
    }

    public int getMaxConnection() {
        return maxConnection;
    }

    public int getNowConnection() {
        return nowConnection;
    }

    public boolean isAllowConnection() {
        return allowConnection;
    }

    public void outLine(String modelName) {
        lines.remove(modelName);
    }

    public void onLine(String modelName, String uniqueKey) {
        lines.put(modelName, uniqueKey);
    }

    public Channel getChannelByUniqueKey(String uniqueKey) {
        for(Channel channel: clients) {
            String modelName = channel.remoteAddress().toString();
            String value = lines.get(modelName);
            if(uniqueKey.equals(value)) {
                return channel;
            }
        }
        return null;
    }

}
