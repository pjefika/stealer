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
import java.util.List;

/**
 *
 * @author G0041775
 */
public interface TVService {

    public List<DecoderTV> listStbs(GetStbsIn in) throws Exception;

    public TesteHpna diagnosticoHpna(DiagnosticoHpnaIn in) throws Exception;
}
