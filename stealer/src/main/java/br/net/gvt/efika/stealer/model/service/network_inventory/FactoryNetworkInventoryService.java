/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.model.service.network_inventory;

/**
 *
 * @author G0042204
 */
public class FactoryNetworkInventoryService {

    public static NetworkInventoryService newNetworkInventoryService() {
        return new NetworkInventoryServiceImpl();
    }

}
