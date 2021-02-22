
package cat.itacademy.proyectoerp.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cat.itacademy.proyectoerp.repository.ClientRepository;
import cat.itacademy.proyectoerp.domain.Client;
import cat.itacademy.proyectoerp.exceptions.ArgumentNotFoundException;
import cat.itacademy.proyectoerp.exceptions.ArgumentNotValidException;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	ClientRepository repository;

	@Override
	public Client createClient(Client client) throws ArgumentNotValidException {
	
		
		if(client.getAddress() == null || client.getAddress().isEmpty()) {
			throw new ArgumentNotValidException("Address can't be empty");
		} else {
			return repository.save(client);
		}
	}

	@Override
	public List<Client> getAllClients() throws ArgumentNotFoundException {
		 if (repository.findAll().isEmpty()) {
			 throw new ArgumentNotFoundException("No clients found");
		 }
		return repository.findAll();
	}

	@Override
	public Optional<Client> findClientById(UUID id) throws ArgumentNotFoundException {
		Optional<Client> tempClient = repository.findById(id);
		if (tempClient==null) {
			throw new ArgumentNotFoundException("The client with id " + id + "doesn't exists");
		} else {
			return repository.findById(id);			
		}
	}

	@Override
	public void updateClient(Client client) {
		  repository.findById(client.getid()).map(clientDB -> {
              BeanUtils.copyProperties(client, clientDB);
              return repository.save(clientDB);
          }
  ).orElseThrow(() -> new ArgumentNotFoundException("Client not found"));
}
			

	@Override
	public void deleteClient(UUID id) {
		repository.deleteById(id);
		
	}
	
	
	public Page<Client> findAllClientsWithPagination (Pageable page) {
		
		return repository.findAll(page);
		
	}

}

