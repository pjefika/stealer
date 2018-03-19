/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.model.service.service_inventory;

import br.net.gvt.efika.efika_customer.model.customer.enums.OrigemInventarioServico;

/**
 *
 * @author G0042204
 */
public class FactoryServiceInventoryService {

    public static ServiceInventoryService create(OrigemInventarioServico origem) throws Exception {
        return new GenericServiceInventoryServiceImpl();
        // throw new Exception("Provedor de Inventário de Serviços indisponível para: " + origem.name());
    }

}
