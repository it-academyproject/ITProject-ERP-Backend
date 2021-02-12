package cat.itacademy.proyectoerp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.proyectoerp.dao.ClientRepository;
import cat.itacademy.proyectoerp.domain.Client;
import cat.itacademy.proyectoerp.exceptions.ArgumentNotFoundException;
import cat.itacademy.proyectoerp.exceptions.ArgumentNotValidException;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	ClientRepository repository;

	@Override
	public Client createClient(Client client) throws ArgumentNotValidException {
		
		//checks that user name and address are filled
		if(client.getUsername() == null || client.getUsername().isEmpty()) {
			throw new ArgumentNotValidException("User must have a name");
		}
		
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
	public Client findClientById(Long id) throws ArgumentNotFoundException {
		Optional<Client> tempClient = repository.findById(id);
		if (tempClient.isEmpty()) {
			throw new ArgumentNotFoundException("The client with id " + id + "doesn't exists");
		} else {
			return repository.findById(id).get();			
		}
	}

	@Override
	public void updateClient(Client client) {
		  repository.findById(client.getId()).map(clientDB -> {
              BeanUtils.copyProperties(client, clientDB);
              ;
              return repository.save(clientDB);
          }
  ).orElseThrow(() -> new ArgumentNotFoundException("Client not found"));
}
			

	@Override
	public void deleteClient(Client client) {
		repository.deleteById(client.getId());
		
	}

}
