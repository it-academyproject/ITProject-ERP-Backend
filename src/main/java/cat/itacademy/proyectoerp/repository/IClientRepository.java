package cat.itacademy.proyectoerp.repository;



import java.util.UUID;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.proyectoerp.domain.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client,UUID> {
	

}
