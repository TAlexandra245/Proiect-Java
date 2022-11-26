package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Builder
public class ClientService {

    private Client client;

    private ClientRepository clientRepository;

    public ClientService(Client client, ClientRepository clientRepository) {
        this.client = client;
        this.clientRepository = clientRepository;
    }
}
