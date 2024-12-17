/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.br.ednocel.spring_openapi_generator.api;

import com.br.ednocel.spring_openapi_generator.model.ClienteRequest;
import com.br.ednocel.spring_openapi_generator.model.ClienteResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-17T09:09:23.047649700-03:00[America/Sao_Paulo]")
@Validated
@Tag(name = "Cliente", description = "Serviço de cliente")
public interface V1Api {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /v1/cliente/{id} : Deletar cliente pelo ID
     * Remove um único registro de cliente pelo ID
     *
     * @param id ID do cliente a ser removido (required)
     * @return Cliente removido com sucesso (status code 204)
     *         or Bad Request (status code 400)
     *         or Cliente não encontrado (status code 404)
     */
    @Operation(
        operationId = "delete",
        summary = "Deletar cliente pelo ID",
        description = "Remove um único registro de cliente pelo ID",
        tags = { "Cliente" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Cliente removido com sucesso"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/v1/cliente/{id}"
    )
    default ResponseEntity<Void> _delete(
        @Parameter(name = "id", description = "ID do cliente a ser removido", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return delete(id);
    }

    // Override this method
    default  ResponseEntity<Void> delete(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /v1/cliente : Buscar todos os clientes no sistema
     * Serviço para buscar a lista de todos os clientes cadastrados no sistema
     *
     * @return Sucesso (status code 200)
     *         or Bad Request (status code 400)
     */
    @Operation(
        operationId = "getAllClientes",
        summary = "Buscar todos os clientes no sistema",
        description = "Serviço para buscar a lista de todos os clientes cadastrados no sistema",
        tags = { "Cliente" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucesso", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ClienteResponse.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/cliente",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ClienteResponse>> _getAllClientes(
        
    ) {
        return getAllClientes();
    }

    // Override this method
    default  ResponseEntity<List<ClienteResponse>> getAllClientes() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"nome\" : \"Leticia Conde\", \"id\" : 51, \"email\" : \"email@email.com\" }, { \"nome\" : \"Leticia Conde\", \"id\" : 51, \"email\" : \"email@email.com\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /v1/cliente/{id} : Buscar cliente pelo ID
     * Retorna um único registro de cliente pelo ID
     *
     * @param id ID do cliente a ser buscado (required)
     * @return Sucesso (status code 200)
     *         or Bad Request (status code 400)
     *         or Cliente não encontrado (status code 404)
     */
    @Operation(
        operationId = "getByIdCliente",
        summary = "Buscar cliente pelo ID",
        description = "Retorna um único registro de cliente pelo ID",
        tags = { "Cliente" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClienteResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/cliente/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ClienteResponse> _getByIdCliente(
        @Parameter(name = "id", description = "ID do cliente a ser buscado", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return getByIdCliente(id);
    }

    // Override this method
    default  ResponseEntity<ClienteResponse> getByIdCliente(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nome\" : \"Leticia Conde\", \"id\" : 51, \"email\" : \"email@email.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /v1/cliente/{id} : Atualizar cliente pelo ID
     * Atualizar um único registro de cliente pelo ID
     *
     * @param id ID do cliente a ser atualizado (required)
     * @param clienteRequest  (required)
     * @return Sucesso (status code 200)
     *         or Bad Request (status code 400)
     *         or Cliente não encontrado (status code 404)
     */
    @Operation(
        operationId = "put",
        summary = "Atualizar cliente pelo ID",
        description = "Atualizar um único registro de cliente pelo ID",
        tags = { "Cliente" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClienteResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Cliente não encontrado")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/v1/cliente/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ClienteResponse> _put(
        @Parameter(name = "id", description = "ID do cliente a ser atualizado", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "ClienteRequest", description = "", required = true) @Valid @RequestBody ClienteRequest clienteRequest
    ) {
        return put(id, clienteRequest);
    }

    // Override this method
    default  ResponseEntity<ClienteResponse> put(Integer id, ClienteRequest clienteRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nome\" : \"Leticia Conde\", \"id\" : 51, \"email\" : \"email@email.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /v1/cliente : Criar novo cliente no sistema
     * Serviço para criar um novo cliente no sistema
     *
     * @param clienteRequest  (required)
     * @return Sucesso (status code 200)
     *         or Bad Request (status code 400)
     */
    @Operation(
        operationId = "saveCliente",
        summary = "Criar novo cliente no sistema",
        description = "Serviço para criar um novo cliente no sistema",
        tags = { "Cliente" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucesso", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ClienteResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/v1/cliente",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ClienteResponse> _saveCliente(
        @Parameter(name = "ClienteRequest", description = "", required = true) @Valid @RequestBody ClienteRequest clienteRequest
    ) {
        return saveCliente(clienteRequest);
    }

    // Override this method
    default  ResponseEntity<ClienteResponse> saveCliente(ClienteRequest clienteRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nome\" : \"Leticia Conde\", \"id\" : 51, \"email\" : \"email@email.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}