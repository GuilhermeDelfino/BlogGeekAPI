package br.com.bloggeek.repository;

import br.com.bloggeek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
