package com.huberto.huberto.users.domain.ports.out;

import com.huberto.huberto.users.domain.model.User;

public interface GetUserProvider {
    User findByEmail(String email);
}
