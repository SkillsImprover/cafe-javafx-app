package com.skillsimprover.cafeapp.dao;

import com.skillsimprover.cafeapp.bo.ClientBo;

import java.util.List;

public interface ClientDao {

    List<ClientBo> loadAllClients();
}
