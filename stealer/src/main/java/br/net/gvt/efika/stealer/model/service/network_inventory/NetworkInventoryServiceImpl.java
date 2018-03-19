/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.model.service.network_inventory;

import br.net.gvt.efika.customer.model.dto.CustomerRequest;
import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;

public class NetworkInventoryServiceImpl implements NetworkInventoryService {

    @Override
    public EfikaCustomer consultar(CustomerRequest req) throws Exception {
        return (EfikaCustomer) new FactoryHttpDAOAbstract<>(EfikaCustomer.class).createWithoutProxy().post(Urls.NETWORK_INVENTORY.getUrl(), req);
    }

}