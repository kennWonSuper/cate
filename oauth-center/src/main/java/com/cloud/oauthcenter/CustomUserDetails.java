package com.cloud.oauthcenter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.security.Principal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CustomUserDetails<T> extends User implements UserDetails {


    private static final long serialVersionUID = 1100L;

    private T user;

    public CustomUserDetails(String username, String password, T user, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.user = user;
    }

    public CustomUserDetails(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, T user, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.user = user;
    }

    public static CustomUserDetails converter(Principal principal) {
        if (principal instanceof OAuth2Authentication) {
            OAuth2Authentication details = (OAuth2Authentication)principal;
            if (details.getPrincipal() instanceof CustomUserDetails) {
                CustomUserDetails userExtend = (CustomUserDetails)details.getPrincipal();
                return userExtend;
            }
        }
        return null;
    }
}
