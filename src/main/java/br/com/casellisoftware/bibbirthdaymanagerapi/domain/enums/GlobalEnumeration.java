package br.com.casellisoftware.bibbirthdaymanagerapi.domain.enums;

public interface GlobalEnumeration {

    Integer getCode();

    String getDescription();

    Object getEnum(Integer code);

    Object[] allValues();
}