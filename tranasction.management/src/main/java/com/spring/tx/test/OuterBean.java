package com.spring.tx.test;

import com.spring.tx.model.User;

public interface OuterBean {

	public void testRequired(User user);
	public void testRequiresNew(User user);
}
