package com.ecaps.cxfdemo.rest.v1.impl;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.ecaps.cxfdemo.rest.v1.UserResource;
@Component("userResourceV1")
public class UserResourceImpl implements UserResource{

	@Override
	public Response getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
