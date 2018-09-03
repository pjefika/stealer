/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.stealer.model.tv;

/**
 *
 * @author G0041775
 */
public class DecoderTV {

    private String mac, baudRate, serial, tecnologia;

    private Long packetsReceived;

    private Double attenuation, packetsLost, snr, phyRate;

    private Boolean certified, isPvr;

    public DecoderTV() {
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(String baudRate) {
        this.baudRate = baudRate;
    }

    public Long getPacketsReceived() {
        return packetsReceived;
    }

    public void setPacketsReceived(Long packetsReceived) {
        this.packetsReceived = packetsReceived;
    }

    public Double getAttenuation() {
        return attenuation;
    }

    public void setAttenuation(Double attenuation) {
        this.attenuation = attenuation;
    }

    public Double getPacketsLost() {
        return packetsLost;
    }

    public void setPacketsLost(Double packetsLost) {
        this.packetsLost = packetsLost;
    }

    public Double getSnr() {
        return snr;
    }

    public void setSnr(Double snr) {
        this.snr = snr;
    }

    public Double getPhyRate() {
        return phyRate;
    }

    public void setPhyRate(Double phyRate) {
        this.phyRate = phyRate;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Boolean getIsPvr() {
        return isPvr;
    }

    public void setIsPvr(Boolean isPvr) {
        this.isPvr = isPvr;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

}
