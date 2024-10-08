package de.ait_tr.g_37_jp_shop.repository;

import de.ait_tr.g_37_jp_shop.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByTitle(String title);
}
