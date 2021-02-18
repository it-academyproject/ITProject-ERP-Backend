package cat.itacademy.proyectoerp.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cat.itacademy.proyectoerp.domain.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, UUID>{
	

//ORDER STATS
	
//Get the orders of a client created between two dates
	@Query("SELECT o FROM Order o WHERE o.clientId  = ?1 AND o.date >= ?2 AND o.date =< ?3")
	Optional<List<Order>> findOrderByClientDate(UUID idClient, Date periodInit, Date periodFinal);

}
