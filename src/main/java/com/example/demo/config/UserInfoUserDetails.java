package com.example.demo.config;

import com.example.demo.models.Mechanic_Details;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserInfoUserDetails implements UserDetails {

    Mechanic_Details mechanicDetails;
    public UserInfoUserDetails(Mechanic_Details mechanicDetails) {
        this.mechanicDetails=mechanicDetails;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return mechanicDetails.getPassword();
    }

    @Override
    public String getUsername() {
        return mechanicDetails.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
