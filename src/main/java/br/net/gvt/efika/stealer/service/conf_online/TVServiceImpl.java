/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.service.conf_online;

import br.net.gvt.efika.stealer.model.TesteHpna;
import br.net.gvt.efika.stealer.model.tv.DecoderTV;
import br.net.gvt.efika.stealer.model.tv.request.DiagnosticoHpnaIn;
import br.net.gvt.efika.stealer.model.tv.request.GetStbsIn;
import br.net.gvt.efika.util.dao.http.Urls;
import br.net.gvt.efika.util.dao.http.factory.FactoryHttpDAOAbstract;
import java.util.List;

public class TVServiceImpl implements TVService {

    @Override
    public List<DecoderTV> listStbs(GetStbsIn in) throws Exception {
        FactoryHttpDAOAbstract<List<DecoderTV>> h = new FactoryHttpDAOAbstract(List.class);
        return (List<DecoderTV>) h.createWithoutProxy().post(Urls.LIST_STB_STEALER.getUrl(), in);
    }

    @Override
    public TesteHpna diagnosticoHpna(DiagnosticoHpnaIn in) throws Exception {
        FactoryHttpDAOAbstract<TesteHpna> h = new FactoryHttpDAOAbstract(TesteHpna.class);
        return (TesteHpna) h.createWithoutProxy().post(Urls.DIAGNOSTICO_HPNA_STEALER.getUrl(), in);
    }

}
