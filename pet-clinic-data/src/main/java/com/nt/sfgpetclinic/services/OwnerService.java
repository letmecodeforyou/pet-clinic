package com.nt.sfgpetclinic.services;

import com.nt.sfgpetclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);

}
