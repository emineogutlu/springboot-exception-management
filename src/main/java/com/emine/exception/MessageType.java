package com.emine.exception;

import lombok.Getter;

@Getter
public enum MessageType {
    NO_RECORD_EXIST("1001","kayıt bulunamadı"),
    GENEREAL_EXCEPTION("9999","genel bir hata oluştu.");



    private String code;

    private String message;
    MessageType(String code, String message) {
     this.code = code;
     this.message = message;
    }


}
