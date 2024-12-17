package com.br.ednocel.spring_openapi_generator.rest;

import com.br.ednocel.spring_openapi_generator.GeradorDeId;
import com.br.ednocel.spring_openapi_generator.api.V1Api;
import com.br.ednocel.spring_openapi_generator.model.ClienteRequest;
import com.br.ednocel.spring_openapi_generator.model.ClienteResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClienteApiDelegateImpl implements V1Api {
    private Map<Integer, ClienteResponse> clientes = new HashMap<>();

    @Override
    public ResponseEntity<ClienteResponse> saveCliente(ClienteRequest clienteRequest) {
        var cliente = new ClienteResponse();
        cliente.setNome(clienteRequest.getNome());
        cliente.setId(GeradorDeId.getNextCode());
        cliente.setEmail(clienteRequest.getEmail());

        clientes.put(cliente.getId(), cliente);

        return ResponseEntity.ok(cliente);
    }

    @Override
    public ResponseEntity<ClienteResponse> getByIdCliente(Integer id) {
        var cliente = clientes.get(id);
        return ResponseEntity.ok(cliente);
    }

    @Override
    public ResponseEntity<List<ClienteResponse>> getAllClientes() {
        List<ClienteResponse> response = this.clientes.values().stream().toList();
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        var cliente = clientes.remove(id);

        return cliente != null ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<ClienteResponse> put(Integer id, ClienteRequest clienteRequest) {
        var clienteById = clientes.get(id);

        if (clienteById == null) {
            return ResponseEntity.notFound().build();
        }

        clienteById.setNome(clienteRequest.getNome());
        clienteById.setEmail(clienteRequest.getEmail());

        clientes.put(clienteById.getId(), clienteById);
        return ResponseEntity.ok(clienteById);
    }

}
