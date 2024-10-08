package de.ait_tr.g_37_jp_shop.service;

import de.ait_tr.g_37_jp_shop.domain.entity.User;
import de.ait_tr.g_37_jp_shop.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}
