/*
 * Copyright (c) 2016. Ryan Ellis
 *
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tic.tab.toe;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/", decoders = {}, encoders = {})
public class SocketServer {

    @OnOpen
    public void onOpen(Session session)
    {
    }

    @OnMessage
    public void onMessage(Session session)
    {
    }

    @OnClose
    public void onClose(Session session)
    {
    }

}
