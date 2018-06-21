package io.github.pascalgrimaud.service;

import io.github.pascalgrimaud.service.dto.EntityWithServiceImplAndDTODTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing EntityWithServiceImplAndDTO.
 */
public interface EntityWithServiceImplAndDTOService {

    /**
     * Save a entityWithServiceImplAndDTO.
     *
     * @param entityWithServiceImplAndDTODTO the entity to save
     * @return the persisted entity
     */
    EntityWithServiceImplAndDTODTO save(EntityWithServiceImplAndDTODTO entityWithServiceImplAndDTODTO);

    /**
     * Get all the entityWithServiceImplAndDTOS.
     *
     * @return the list of entities
     */
    List<EntityWithServiceImplAndDTODTO> findAll();


    /**
     * Get the "id" entityWithServiceImplAndDTO.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<EntityWithServiceImplAndDTODTO> findOne(Long id);

    /**
     * Delete the "id" entityWithServiceImplAndDTO.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}