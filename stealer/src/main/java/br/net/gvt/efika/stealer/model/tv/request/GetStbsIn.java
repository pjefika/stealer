/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.model.tv.request;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.stealer.model.entity.LoggerIn;

/**
 *
 * @author G0042204
 */
public class GetStbsIn extends LoggerIn {

    private EfikaCustomer ec;

    public GetStbsIn() {
    }

    public GetStbsIn(EfikaCustomer ec) {
        this.ec = ec;
    }

    @Override
    public String getAcao() {
        return "ConfOnlineController.getStbs";
    }

    public EfikaCustomer getEc() {
        return ec;
    }

    public void setDesignador(EfikaCustomer ec) {
        this.ec = ec;
    }

}
