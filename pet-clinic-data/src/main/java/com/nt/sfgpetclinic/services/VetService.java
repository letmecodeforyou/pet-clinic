package com.nt.sfgpetclinic.services;

import com.nt.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
