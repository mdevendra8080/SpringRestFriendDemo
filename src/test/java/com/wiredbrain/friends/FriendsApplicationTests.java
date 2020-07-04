package com.wiredbrain.friends;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wiredbrain.friends.controller.FriendController;

@SpringBootTest
class FriendsApplicationTests {

	@Autowired
	FriendController friendController;
	
	@Test
	public void contextLoads() {
		//Assert.assertNotNull(friendController);
	}
}
