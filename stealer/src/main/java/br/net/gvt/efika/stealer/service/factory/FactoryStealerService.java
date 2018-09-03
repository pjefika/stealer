/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.service.factory;

import br.net.gvt.efika.stealer.service.conf_online.TVService;
import br.net.gvt.efika.stealer.service.conf_online.TVServiceImpl;

/**
 *
 * @author G0041775
 */
public class FactoryStealerService {

    public static TVService tvService() {
        return new TVServiceImpl();
    }

}
