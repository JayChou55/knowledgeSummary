package com.thinkgem.jeesite.activemq.listener;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 接收Activemq发送的消息
 * <p>Title: MyMessageListener</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
public class MyMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			//接收到消息
			TextMessage textMessage = (TextMessage) message;
			String text = textMessage.getText();
			System.out.println("MyMessageListener"+text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
