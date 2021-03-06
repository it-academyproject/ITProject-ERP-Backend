package cat.itacademy.proyectoerp.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import cat.itacademy.proyectoerp.domain.Client;
import cat.itacademy.proyectoerp.dto.ClientDTO;

public interface IClientService {
	
	public Client createClient(Client client); //CREATE - Adds new client to the Database
	
	public Client createFastClient(ClientDTO client); // CREATE - Adds a new client without needing an username. Only for admin purposes.
	
	public List<Client> getAllClients(); // READ - full list of all clients
	
	public List<ClientDTO> getPageOfClients(int page, int amount); // READ - Get a page of X clients
	
	public Optional<Client> findClientById(UUID id); //READ - finds the client by Id
	
	public Client updateClient(Client client); //UPDATE - Updates clients info
	
	public void deleteClient(UUID id); //DELETE - deletes client

	List<ClientDTO> listAllUsers();

}
