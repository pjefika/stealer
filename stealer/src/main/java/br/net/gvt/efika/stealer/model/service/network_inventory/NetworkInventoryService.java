/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.model.service.network_inventory;

import br.net.gvt.efika.customer.model.dto.CustomerRequest;
import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;

/**
 *
 * @author G0042204
 */
public interface NetworkInventoryService {


    public InventarioRede consultar(CustomerRequest cust) throws Exception;

}
