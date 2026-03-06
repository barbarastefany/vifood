package com.vitoriadeveloper.vifood.domain.exceptions;

import java.util.UUID;

public class CityNotFoundException extends com.vitoriadeveloper.vifood.domain.exceptions.BusinessException {

    public CityNotFoundException(UUID id) {
        super("Cidade de id: " + id + " não encontrado!");
    }
}
